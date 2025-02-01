package NivelIntermediario;

//Classe Abstrata permite métodos abstratos, os quais obrigarão as classes herdeiras implementarem-os de sua forma
//Não é possível a instância, somente dos filhos
//Boa para manutenção do código
public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

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

    public void atirarKunai() {
        System.out.println("Jogando kunai!!");
    }

    //Sobreescrevendo o método da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e essa é minha estratégia de combate ninja.");
    }
}
