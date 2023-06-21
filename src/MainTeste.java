public class MainTeste {
    public static void main(String[] args) {
        ClienteComum clienteComum = new ClienteComum("Luciano 1");
        ClienteEspecial clienteEspecial = new ClienteEspecial("Luciano 2");

        System.out.println("##########");
        boolean entradaTemporaria1 = true;
        String descricaoTemporaria1 = "Salario 1";
        Double valorTemporario1 = 1000.0;
        Movimenta movimenta1 = new Movimenta(entradaTemporaria1, descricaoTemporaria1, valorTemporario1);
        clienteComum.getCartao().registraOperacao(movimenta1);
        boolean entradaTemporaria2 = false;
        String descricaoTemporaria2 = "Tenis 2";
        Double valorTemporario2 = 2200.0;
        Movimenta movimenta2 = new Movimenta(entradaTemporaria2, descricaoTemporaria2, valorTemporario2);
        clienteComum.getCartao().registraOperacao(movimenta2);
        System.out.println(clienteComum.mostraNome());
        System.out.println(clienteComum.getCategoria());
        System.out.println(clienteComum.getCartao().getChequeEspecial());
        System.out.println(clienteComum.mostraSaldo());

        System.out.println("##########");
        boolean entradaTemporaria3 = true;
        String descricaoTemporaria3 = "Salario 3";
        Double valorTemporario3 = 3000.0;
        Movimenta movimenta3 = new Movimenta(entradaTemporaria3, descricaoTemporaria3, valorTemporario3);
        clienteEspecial.getCartao().registraOperacao(movimenta3);
        boolean entradaTemporaria4 = false;
        String descricaoTemporaria4 = "Tenis 4";
        Double valorTemporario4 = 4400.0;
        Movimenta movimenta4 = new Movimenta(entradaTemporaria4, descricaoTemporaria4, valorTemporario4);
        clienteEspecial.getCartao().registraOperacao(movimenta4);
        System.out.println(clienteEspecial.mostraNome());
        System.out.println(clienteEspecial.getCategoria());
        System.out.println(clienteEspecial.getCartao().getChequeEspecial());
        System.out.println(clienteEspecial.mostraSaldo());

        System.out.println("##########");
        for (Movimenta cartao1: clienteComum.getCartao().getExtrato()) {
            System.out.println(cartao1);
        }

        System.out.println("##########");
        for (Movimenta cartao2: clienteEspecial.getCartao().getExtrato()) {
            System.out.println(cartao2);
        }

        System.out.println("##########");
    }
}
