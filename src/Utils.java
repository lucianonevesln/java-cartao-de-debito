public class Utils {
    private byte controleDoMenuInicial;
    private byte controleDoMenuDeOperacao;
    private boolean entradaTemporaria;
    private String descricaoTemporaria;
    private Double valorTemporario;

    public boolean isEntradaTemporaria() {
        return entradaTemporaria;
    }

    public void setEntradaTemporaria(boolean entradaTemporaria) {
        this.entradaTemporaria = entradaTemporaria;
    }

    public String getDescricaoTemporaria() {
        return descricaoTemporaria;
    }

    public void setDescricaoTemporaria(String descricaoTemporaria) {
        this.descricaoTemporaria = descricaoTemporaria;
    }

    public Double getValorTemporario() {
        return valorTemporario;
    }

    public void setValorTemporario(Double valorTemporario) {
        this.valorTemporario = valorTemporario;
    }

    public byte getControleDoMenuDeOperacao() {
        return controleDoMenuDeOperacao;
    }

    public void setControleDoMenuDeOperacao(byte controleDoMenuDeOperacao) {
        this.controleDoMenuDeOperacao = controleDoMenuDeOperacao;
    }

    public byte getControleDoMenuInicial() {
        return controleDoMenuInicial;
    }

    public void setControleDoMenuInicial(byte controle) {
        this.controleDoMenuInicial = controle;
    }

    public void pedeOpcaoDeMenuInicial () {
        System.out.println("""
                           ########################################
                           Escolha a opção:
                           1 - Cadastrar/operar cliente comum;
                           2 - Cadastrar/operar cliente especial;
                           3 - Sair.
                           ########################################
                           Digite aqui:""");
    }

    public void pedeOpcaoDeMenuDeOperacao () {
        System.out.println("""
                           ########################################
                           Escolha uma operação:
                           1 - Inserir/aumentar saldo;
                           2 - Registrar despesa;
                           3 - Consultar saldo;
                           4 - Consultar cheque especial;
                           5 - Consultar extrato;
                           6 - Sair.
                           ########################################
                           Digite aqui:""");
    }

    public void pedeOpcaoValida () {
        System.out.println("Digite uma opção válida!");
    }

    public void pedeNome () {
        System.out.println("Digite o nome do titular da conta comum:");
    }

    public void pedeDescricao () {
        System.out.println("Descrição da operação:");
    }

    public void pedeValor () {
        System.out.println("Valor da operação:");
    }

}
