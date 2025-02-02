package NivelIntermediario;

public class Haruno extends Ninja {

    public Haruno() {
    }

    public Haruno(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelDoNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void AtivarCura() {
        System.out.println("Meu nome é " + nome + " e estou curando.");
    }

    @Override
    public void saudacao() {
        System.out.println("Olá, tudo bem? Eu sou o " + nome + " e pertenço ao clã Haruno.");
    }
}
