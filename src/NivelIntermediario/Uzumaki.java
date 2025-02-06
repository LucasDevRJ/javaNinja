package NivelIntermediario;

public class Uzumaki extends Ninja {

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelDoNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void ModoSabioAtivado() {
        System.out.println("Eu sou o " + getNome() + " no Modo Sábio!");
    }

    @Override
    public void saudacao() {
        System.out.println("Olá, tudo bem? Eu sou o " + getNome() + " e pertenço ao clã Uzumaki.");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + getNome() + " e esse é meu ataque Uzumaki, um ataque de ar");
    }

    //não pode ser sobrescrito
//    @Override
//    public void atirarKunai() {
//        System.out.println("Jogando kunai como um Uzumaki!!");
//    }

}
