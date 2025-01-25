package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    /*
        Método String tem que retornar uma String
     */
    public String EuSouUmNinja() {
        return "Oi, eu sou um ninja!";
    }

    /*
        Método int vai retornar um int
     */
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }
}
