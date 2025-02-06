package NivelIntermediario;

public enum Bijuus {
    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi","Yugito Nii", 2),
    ISOBU("Isobu", "Yagura", 3),
    SON_GOKU("Son Goku", "Rōshi", 4),
    KOKUOU("Kokuou", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOUMEI("Choumei", "Fū", 7),
    GYUUKI("Gyuuki", "Killer B", 8),
    KURAMA("Kurama", "Naruto", 9);

    private String nome;
    private String portador;
    private int numeroDeCaudas;

    Bijuus(String nome, String portador, int numeroDeCaudas) {
        this.nome = nome;
        this.portador = portador;
        this.numeroDeCaudas = numeroDeCaudas;
    }

    public String getNome() {
        return nome;
    }

    public String getPortador() {
        return portador;
    }

    public int getNumeroDeCaudas() {
        return numeroDeCaudas;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nPortador: " + getPortador() + "\nCaudas: " + getNumeroDeCaudas();
    }
}
