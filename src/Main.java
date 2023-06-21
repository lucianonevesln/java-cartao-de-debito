import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Utils utils = new Utils();

        utils.setControleDoMenuInicial((byte) 0);

        while (utils.getControleDoMenuInicial() != 3) {
            utils.pedeOpcaoDeMenuInicial();
            utils.setControleDoMenuInicial(leitura.nextByte());

            if (utils.getControleDoMenuInicial() == (byte) 1) {
                utils.pedeNome();
                ClienteComum clienteComum = new ClienteComum(leitura.next());
                utils.pedeOpcaoDeMenuDeOperacao();
                utils.setControleDoMenuDeOperacao(leitura.nextByte());

                while (utils.getControleDoMenuDeOperacao() != (byte) 6) {
                    if (utils.getControleDoMenuDeOperacao() == (byte) 1) {
                        utils.setEntradaTemporaria(true);
                        utils.pedeDescricao();
                        utils.setDescricaoTemporaria(leitura.next());
                        utils.pedeValor();
                        utils.setValorTemporario(leitura.nextDouble());
                        Movimenta movimenta = new Movimenta(utils.isEntradaTemporaria(), utils.getDescricaoTemporaria(),
                                utils.getValorTemporario());
                        clienteComum.getCartao().registraOperacao(movimenta);
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());

                    } else if (utils.getControleDoMenuDeOperacao() == (byte) 2) {
                        utils.setEntradaTemporaria(false);
                        utils.pedeDescricao();
                        utils.setDescricaoTemporaria(leitura.next());
                        utils.pedeValor();
                        utils.setValorTemporario(leitura.nextDouble());
                        Movimenta movimenta = new Movimenta(utils.isEntradaTemporaria(), utils.getDescricaoTemporaria(),
                                utils.getValorTemporario());
                        clienteComum.getCartao().registraOperacao(movimenta);
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());

                    } else if (utils.getControleDoMenuDeOperacao() == (byte) 3) {
                        System.out.println(clienteComum.mostraSaldo());
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());

                    } else if (utils.getControleDoMenuDeOperacao() == (byte) 4) {
                        System.out.println(clienteComum.getCartao().getChequeEspecial());;
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());

                    } else if (utils.getControleDoMenuDeOperacao() == (byte) 5) {
                        clienteComum.mostraExtrato();
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());

                    } else if (utils.getControleDoMenuDeOperacao() == (byte) 6) {
                        utils.setControleDoMenuInicial((byte) 3);
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());

                    } else {
                        utils.pedeOpcaoValida();
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());
                    }
                }

            } else if (utils.getControleDoMenuInicial() == (byte) 2) {
                utils.pedeNome();
                ClienteEspecial clienteEspecial = new ClienteEspecial(leitura.next());
                utils.pedeOpcaoDeMenuDeOperacao();
                utils.setControleDoMenuDeOperacao(leitura.nextByte());

                while (utils.getControleDoMenuDeOperacao() != (byte) 6) {
                    if (utils.getControleDoMenuDeOperacao() == (byte) 1) {
                        utils.setEntradaTemporaria(true);
                        utils.pedeDescricao();
                        utils.setDescricaoTemporaria(leitura.next());
                        utils.pedeValor();
                        utils.setValorTemporario(leitura.nextDouble());
                        Movimenta movimenta = new Movimenta(utils.isEntradaTemporaria(), utils.getDescricaoTemporaria(),
                                utils.getValorTemporario());
                        clienteEspecial.getCartao().registraOperacao(movimenta);
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());

                    } else if (utils.getControleDoMenuDeOperacao() == (byte) 2) {
                        utils.setEntradaTemporaria(false);
                        utils.pedeDescricao();
                        utils.setDescricaoTemporaria(leitura.next());
                        utils.pedeValor();
                        utils.setValorTemporario(leitura.nextDouble());
                        Movimenta movimenta = new Movimenta(utils.isEntradaTemporaria(), utils.getDescricaoTemporaria(),
                                utils.getValorTemporario());
                        clienteEspecial.getCartao().registraOperacao(movimenta);
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());

                    } else if (utils.getControleDoMenuDeOperacao() == (byte) 3) {
                        System.out.println(clienteEspecial.mostraSaldo());
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());

                    } else if (utils.getControleDoMenuDeOperacao() == (byte) 4) {
                        System.out.println(clienteEspecial.getCartao().getChequeEspecial());;
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());

                    } else if (utils.getControleDoMenuDeOperacao() == (byte) 5) {
                        clienteEspecial.mostraExtrato();
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());

                    } else if (utils.getControleDoMenuDeOperacao() == (byte) 6) {
                        utils.setControleDoMenuInicial((byte) 3);
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());

                    } else {
                        utils.pedeOpcaoValida();
                        utils.pedeOpcaoDeMenuDeOperacao();
                        utils.setControleDoMenuDeOperacao(leitura.nextByte());
                    }
                }
            }
        }
    }

}
