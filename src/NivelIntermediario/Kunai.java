package NivelIntermediario;

public class Kunai {
    private String nome;
    public Kunai() {

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
