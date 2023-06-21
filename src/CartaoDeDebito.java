import java.util.ArrayList;
import java.util.List;

public class CartaoDeDebito {
    private Double saldo;
    private Double chequeEspecial;
    private List<Movimenta> extrato;

    public CartaoDeDebito(Double saldo, Double chequeEspecial) {
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.extrato = new ArrayList<>();
    }

    public boolean registraOperacao (Movimenta movimenta) {
        if (movimenta.isEntrada()) {
            this.saldo += movimenta.getValor();
            extrato.add(movimenta);
            return true;
        } else {
            if (movimenta.getValor() <= this.saldo) {
                this.saldo -= movimenta.getValor();
                extrato.add(movimenta);
                return true;
            } else if (movimenta.getValor() <= this.saldo + this.chequeEspecial) {
                this.chequeEspecial -= movimenta.getValor() - this.saldo;
                this.saldo -= this.saldo;
                extrato.add(movimenta);
                return true;
            }
            System.out.println("Saldo insulficiente para realizar essa operação!");
            return false;
        }
    }

    public Double getSaldo() {
        return saldo;
    }
    public String getChequeEspecial() {
        return "Valor de Cheque Especial: " + chequeEspecial;
    }

    public List<Movimenta> getExtrato() {
        return extrato;
    }

    @Override
    public String toString() {
        return "Saldo de: " + saldo;
    }

}
