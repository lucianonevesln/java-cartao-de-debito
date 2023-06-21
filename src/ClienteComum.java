public class ClienteComum extends Pessoa implements MostraNome, MostraSaldo, MostraExtrato {
    private String categoria;
    private CartaoDeDebito cartao;

    public ClienteComum(String nome) {
        super(nome);
        this.categoria = "Comum";
        this.cartao = new CartaoDeDebito(0.0, 1000.0);
    }

    public String getCategoria() {
        return categoria;
    }

    public CartaoDeDebito getCartao() {
        return cartao;
    }

    @Override
    public String mostraNome() {
        return "Cliente Comum, Sr(a).: " + this.getNome();
    }

    @Override
    public String mostraSaldo() {
        return "Cliente Comum, " + this.getNome() + ", seu saldo é de: " + this.getCartao().getSaldo();
    }

    @Override
    public void mostraExtrato() {
        for (Movimenta item: cartao.getExtrato()) {
            System.out.println(item);
        }
    }

}
