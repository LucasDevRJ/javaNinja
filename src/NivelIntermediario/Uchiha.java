package NivelIntermediario;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelDoNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    //sobreescritura do método da classe Ninja
    @Override
    public void saudacao() {
        System.out.println("Olá, tudo bem? Eu sou o " + getNome() + " e pertenço ao clã Uchiha.");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + getNome() + " e esse é meu ataque Uchiha, um ataque de fogo");
    }

    /*
        Implementado pela Interface SharinganInterface
     */
    @Override
    public void SharinganAtivado() {
        System.out.println("Meu nome é " + getNome() + ". O Sharingan Ativou, eu sou um Uchiha!");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + getNome() + " e essa é minha inteligência de combate ninja.");
    }
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é " + qi + ", então você é um gênio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é " + qi + ", então você é um promissor!");
        } else {
            System.out.println("Seu QI é " + qi + ", então você precisa treinar mais suas estratégias!");
        }
    }

    @Override
    //@Override não é algo obrigatório ao reescrever um método
    //Mas os programador a utilizam pois é uma padronização do Java
    //E previne que haja erros de digitação ao chamar o método sobrescrito
    public void metodoProvisorio() {
        System.out.println("Teste, na classe Uchiha");
    }

}
