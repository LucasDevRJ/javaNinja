package NivelIntermediario;

public class Shuriken {
    private String nome;
    public Shuriken() {

    }
    public Shuriken(String nome) {
        this.nome = nome;
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
