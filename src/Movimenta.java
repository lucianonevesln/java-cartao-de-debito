public class Movimenta {
    private boolean entrada;
    private String descricao;
    private Double valor;

    public Movimenta(boolean entrada, String descricao, Double valor) {
        this.entrada = entrada;
        this.descricao = descricao;
        this.valor = valor;
    }

    public boolean isEntrada() {
        return entrada;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao + " | Valor: " + valor;
    }

}
