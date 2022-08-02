//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Exemplar {
    private int codigo;
    private boolean cativa;
    private boolean emprestada;

    public Exemplar(int codigo, boolean cativa, boolean emprestada) {
        this.codigo = codigo;
        this.cativa = cativa;
        this.emprestada = emprestada;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isCativa() {
        return this.cativa;
    }

    public void setCativa(boolean cativa) {
        this.cativa = cativa;
    }

    public boolean isEmprestada() {
        return this.emprestada;
    }

    public void setEmprestada(boolean emprestada) {
        this.emprestada = emprestada;
    }

    public String exibirInfo2() {
        return this.codigo + " / " + this.cativa + " / " + this.emprestada;
    }
}
