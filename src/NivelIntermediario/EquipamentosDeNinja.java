package NivelIntermediario;

public class EquipamentosDeNinja {

    private String nome;

    public EquipamentosDeNinja(String nome) {
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
        return nome;
    }
}
