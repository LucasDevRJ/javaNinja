package NivelIntermediario;

public enum RankDeMissoes {
    D("Baixo", 2),
    C("Moderado", 3),
    B("Difícil", 4),
    A("Muito Difícil", 5),
    S("Extremamente Difícil", 6);

    private String descricao;
    private int dificuldade;

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

}
