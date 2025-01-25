package Array;

public class ArrayBidimensional {
    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][3];

        //Coluna 0/Matriz 0
        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        //Coluna 1/Matriz 1
        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza Momochi";
        ninjasEAldeias[1][2] = "Haku";

        //Coluna 1/Matriz 1
        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        System.out.println(ninjasEAldeias); //referência da memória
        System.out.println(ninjasEAldeias.length); //tamanho
        System.out.println(ninjasEAldeias[0][1]); //Naruto Uzumaki

        //Exibindo todas as linhas da coluna 0
        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println(ninjasEAldeias[0][i]);
        }

        //Exibindo Coluna 1 de todas as linhas
        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println(ninjasEAldeias[i][1]);
        }
    }
}
