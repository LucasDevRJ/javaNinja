package NivelIntermediario;

//Classe Abstrata permite métodos abstratos, os quais obrigarão as classes herdeiras implementarem-os de sua forma
//Não é possível a instância, somente dos filhos
//Boa para manutenção do código
//Essa é uma super classe, pois dá origem a outras classes
public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    //TODO: incluir dois novos atributos, número de missões concluídas e o rank
    int numeroDeMissoesConcluidas;
    NivelDoNinja rank;
//    final double altura = 1.74; //se for final não poderá atribuir outros valores nos Objetos criados

    public Ninja() {

    }

    //TODO NINJA VAI FAZER OBRIGATORIAMENTE
    //final = determina que o método não pode ser sobrescrito
    final void atirarKunai() {
        System.out.println("Jogando kunai!!");
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: sobrecarga do construtor, chamada dos novos atributos
    //Não é preciso redeclaras os atributos anteriores dentro no novo construtor
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelDoNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public abstract void saudacao();
    /*
        Método int vai retornar um int
     */
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

    //Método geral! Todos os ninjas vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }


    void exibeRank() {
        System.out.println("Meu nome é " + this.nome + " e sou um " + this.rank);
    }

    void exibeQuantidadeDeMissoesFinalizadas() {
        System.out.println("Eu, " + this.nome + " já finalizei " + this.numeroDeMissoesConcluidas + " missões.");
    }

    //Sobreescrevendo o método da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e essa é minha estratégia de combate ninja.");
    }

    //inteligência de combate, método padrão que vem da interface EstrategiaDeBatalha
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " e essa é minha inteligência de combate ninja.");
    }

    //Sobrecarga do método inteligenciaDeCombate
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é " + qi + ", então você é um gênio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é " + qi + ", então você é um promissor!");
        } else {
            System.out.println("Seu QI é " + qi + ", então você precisa treinar mais suas estratégias!");
        }
    }

    public void metodoProvisorio() {
        System.out.println("Teste na classe Ninja");
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nAldeia: " + this.aldeia + "\nIdade: " + this.idade + "\nMissões: "
                + this.numeroDeMissoesConcluidas + "\nRank: " + this.rank;
    }
}
