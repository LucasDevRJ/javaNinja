package Array;

public class Array {
    public static void main(String[] args) {

        //Cada variável criada é um espaço de memória utilizado
        //Mas isso não acontece com o array
        //Pois ele tem um espaço de armazenamento para guardar vários dados

        String[] ninjas = new String[6]; //4 é o tamanho total do array
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "kakashi Hatake";
        ninjas[4] = "Shikamaru Nara";
        //ninjas[5] = "Orochimaru"; não tem espaço para esse

        System.out.println(ninjas[0]);
        System.out.println(ninjas[1]);
        System.out.println(ninjas[2]);
        System.out.println(ninjas[3]);
        System.out.println(ninjas[4]);
        System.out.println(ninjas[5]); //null, porque não tem nada dentro
        System.out.println(ninjas); //referência ao espaço alocado na memória

        int[] idades = new int[2];
        idades[0] = 16;
        System.out.println(idades[0]);
        System.out.println(idades[1]); //0, porque não tem nada adicionado

        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]); //false pois não foi inicializado

        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);

//        String ninja1 = "Naruto Uzumaki";
//        String ninja2 = "Sasuke Uchiha";
//        String ninja3 = "Sakura Haruno";
//
//        System.out.println(ninja1);
//        System.out.println(ninja2);
//        System.out.println(ninja3);
    }
}
