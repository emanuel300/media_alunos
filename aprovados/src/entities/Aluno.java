package entities;

public class Aluno {
    private String nome;
    private double b1;
    private double b2;

    public Aluno(String nome, double b1, double b2) {
        this.nome = nome;
        this.b1 = b1;
        this.b2 = b2;
    }

    public Aluno(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public double getB2() {
        return b2;
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }

    public double mediaAlunos(double b1, double b2){
        double resultado = (b1 + b2) / 2;
        return resultado;
    }

}
