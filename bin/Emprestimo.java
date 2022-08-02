//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Emprestimo {
    private int situacao;
    private String dataDeEmprestimo;
    private String dataPrevistaDeDevolucao;
    private String dataDeEntregaReal;

    public Emprestimo(int situacao, String dataDeEmprestimo, String dataPrevistaDeDevolucao, String dataDeEntregaReal) {
        this.situacao = situacao;
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
        this.dataDeEntregaReal = dataDeEntregaReal;
    }

    public int getSituacao() {
        return this.situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public String getDataDeEmprestimo() {
        return this.dataDeEmprestimo;
    }

    public void setDataDeEmprestimo(String dataDeEmprestimo) {
        this.dataDeEmprestimo = dataDeEmprestimo;
    }

    public String getDataPrevistaDeDevolucao() {
        return this.dataPrevistaDeDevolucao;
    }

    public void setDataPrevistaDeDevolucao(String dataPrevistaDeDevolucao) {
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
    }

    public String getDataDeEntregaReal() {
        return this.dataDeEntregaReal;
    }

    public void setDataDeEntregaReal(String dataDeEntregaReal) {
        this.dataDeEntregaReal = dataDeEntregaReal;
    }

    public String exibirInfo3() {
        return this.situacao + " / " + this.dataDeEmprestimo + " / " + this.dataPrevistaDeDevolucao + " / " + this.dataDeEntregaReal;
    }
}
