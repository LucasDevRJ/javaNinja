package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
            Ternários: são maneiras de reduzir o código
            Estrutura: variável = (condição) ? valorSeForVerdadeiro : valorSeForFalso;
         */

        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivel);
    }
}
