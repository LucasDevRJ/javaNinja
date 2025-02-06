package NivelIntermediario;

public class Missoes {
    private String nome;
    private RankDeMissoes rank;

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public void exibirDetalhes() {
        System.out.println("Nome da Missão: " + this.nome);
        System.out.println("Rank da Missão: " +  "(Descrição: " + this.rank.getDescricao()  + ", Nível: " + this.rank.getDificuldade() + ")");
    }
}
