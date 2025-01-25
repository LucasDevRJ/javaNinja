package NivelIniciante.LacosDeRepeticao;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
            Laços de Repetição: vão repetir infinitamente ou até atingir o parâmetro desejado
            Exemplos: while, for
         */

        //while (condição) { Tudo aqui vai acontecer }

//        int numeroDeClones = 0;
        int numeroMaximoClones = 40;

//        while (numeroDeClones <= numeroMaximoClones) {
//            numeroDeClones++;
//            System.out.println("O Naruto fez um clone das sombras");
//            System.out.println("Número de clones: " + numeroDeClones);
//        }

        //for
        for (int i = 1; i < numeroMaximoClones; i++) {
            String maisDeUmClone = i > 1 ? " vezes" : " vez";
            System.out.println("O Naruto esta se clonando e já se clonou " + i + maisDeUmClone);
        }

        for (int i = 2026; i < 3000; i = i + 4) {
            System.out.printf("Haverá eleição no ano %d\n", i);
        }
    }
}
