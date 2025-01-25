package NivelIniciante.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
            If e Else - Condições
            Objetivo: Passar o ninja de nível de acordo com o número de missões
         */

        String nome = "Kakashi";
        String cla = "Hatake";
        String rank;
        boolean hokage = false;
        short numeroDeMissoes = 80;

        if (numeroDeMissoes <= 30) {
            rank = "Gennin";
        } else if (numeroDeMissoes <= 50) {
            rank = "Chunnin";
        } else if (numeroDeMissoes <= 100) {
            rank = "Jounin";
        } else {
            hokage = true;
            rank = "Hokage";
        }

        System.out.println("Ninja: " + nome);
        System.out.println("Clã: " + cla);
        System.out.println("Rank: " + rank);
        System.out.println("Número de Missões: " + numeroDeMissoes);

    }
}
