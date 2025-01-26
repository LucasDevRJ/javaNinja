package NivelIntermediario;

public class Hokage {
    String nome;
    int idade;
    boolean vivo;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public Hokage() {
        //construtor vázio
    }

    public Hokage(String nome, int idade, boolean vivo) {
        this.nome = nome;
        this.idade = idade;
        this.vivo = vivo;
    }

    //All args Constructor. Construtor com todos os argumentos
    public Hokage(String nome, int idade, boolean vivo, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivo = vivo;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }

    public Hokage(String nome) {
        this.nome = nome;
    }

    public Hokage(int idade) {
        this.idade = idade;
    }
}
