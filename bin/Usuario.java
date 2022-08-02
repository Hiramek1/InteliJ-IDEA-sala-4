//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Usuario {
    private String nome;
    private String telefone;
    private int cpf;
    private int matricula;

    public Usuario(String nome, String telefone, int cpf, int matricula) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void incrementarMatricula() { this.matricula = matricula++; }
    public String exibirInfo() {
        return this.nome + " / " + this.telefone + " / " + this.cpf + " / " + this.matricula;
    }
}
