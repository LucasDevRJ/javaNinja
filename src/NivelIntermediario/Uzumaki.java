package NivelIntermediario;

public class Uzumaki extends Ninja {

    public void ModoSabioAtivado() {
        System.out.println("Eu sou o " + nome + " no Modo Sábio!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de ar");
    }
}
