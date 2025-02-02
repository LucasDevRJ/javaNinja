package NivelIntermediario;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface {
    public Hatake() {

    }

    public Hatake(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelDoNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
    @Override
    public void saudacao() {
        System.out.println("Eu sou " + super.nome + " e pertenço ao clã Hatake.");
    }

    @Override
    public void SharinganAtivado() {
        System.out.println("Sou conhecido como Kakashi do Sharingan!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Eu, " + super.nome + " sou um ninja de elite da ANBU.");
    }

    @Override
    public void seTornarHokage() {
        System.out.println("Eu, " + super.nome + ", sou o Sexto Hokage!");
    }
}
