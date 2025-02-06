package NivelIntermediario;

final public class Naruto extends Uzumaki {

    private final String nome = "Naruto";
    private final String cla = "Uzumaki";
    private final Bijuus bijuu = Bijuus.KURAMA;
    private final String jutsuMaisUsado = "Clones das Sombras";

    @Override
    public String getNome() {
        return nome;
    }

    public String getCla() {
        return cla;
    }

    public String getBijuu() {
        return bijuu.getNome();
    }

    public String getJutsuMaisUsado() {
        return jutsuMaisUsado;
    }

    public void apresentacao() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Eu sou o " + getNome() + ", do clã " + getCla() + ", portador da Bijuu " + getBijuu()
                + " e meu jutsu mais usado é o " + getJutsuMaisUsado();
    }
}
