package Scanner;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
            Scanner = É um jeito do usuário trazer o usuário para dentro da aplicação.
            Objetivo: O usuário vai criar um ninja e vamos validar os dados
        */

        //Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        //Receber o nome do ninja
        System.out.print("Escreva aqui o nome do(a) ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.printf("O nome do(a) ninja é %s.\n", nomeDoNinja);

        //Receber a idade do ninja
        System.out.printf("\nDigite a idade do(a) %s: ", nomeDoNinja);
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.printf("A idade do(a) %s é %d anos.\n", nomeDoNinja, idadeDoNinja);

        //Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.printf("\n%s já é maior de idade e pode ir para missões fora da aldeia.", nomeDoNinja);
        } else {
            System.out.printf("\n%s é muito novo ainda, precisa treinar mais antes de sair da vila.", nomeDoNinja);
        }

        //Fechar o Scanner
        caixaDeTexto.close();
    }
}
