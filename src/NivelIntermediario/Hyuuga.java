package NivelIntermediario;

public class Hyuuga extends Ninja {

    public Hyuuga() {
    }

    public Hyuuga(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelDoNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void ativarByakugan() {
        System.out.println("Meu nome é " + nome + ". O Byakugan Ativou, eu sou um Hyuuga!");
    }

    @Override
    public void saudacao() {
        System.out.println("Olá, tudo bem? Eu sou o " + nome + " e pertenço ao clã Hyuuga.");
    }
}
