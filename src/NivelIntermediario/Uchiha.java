package NivelIntermediario;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    /*
     * O método Void não retorna valor
     **/
    public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O Sharingan Ativou, eu sou um Uchiha!");
    }

    //sobreescritura do método da classe Ninja
    @Override
    public void saudacao() {
        System.out.println("Olá, tudo bem? Eu sou o " + nome + " e pertenço ao clã Uchiha.");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo");
    }
}
