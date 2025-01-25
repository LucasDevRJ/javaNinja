package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //Criar um método público personalizado

    /*
     * O método Void não retorna valor
     **/
    public void SharinganAtivado() {
        System.out.println("O Sharingan Ativou!");
    }

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
