public class ClienteEspecial extends Pessoa implements MostraNome, MostraSaldo, MostraExtrato {
    private String categoria;
    private CartaoDeDebito cartao;

    public ClienteEspecial(String nome) {
        super(nome);
        this.categoria = "Especial";
        this.cartao = new CartaoDeDebito(0.0, 2000.0);
    }

    public String getCategoria() {
        return categoria;
    }

    public CartaoDeDebito getCartao() {
        return cartao;
    }

    @Override
    public String mostraNome() {
        return "Cliente Especial, Sr(a).: " + this.getNome();
    }

    @Override
    public String mostraSaldo() {
        return "Cliente Especial, " + this.getNome() + ", seu saldo é de: " + this.getCartao().getSaldo();
    }

    @Override
    public void mostraExtrato() {
        for (Movimenta item: cartao.getExtrato()) {
            System.out.println(item);
        }
    }

}
