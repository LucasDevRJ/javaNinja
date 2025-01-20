package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {

    public static void main(String[] args) {
        /*
            SwitchCases: Que servem para gerar casos específicos
            Objetivo: Pedir pro usuário escolher entre os ninjas
            switchCase
         */

        //Pedir para o usuário
        Scanner scanner = new Scanner(System.in);

        //Mostrar opções para o usuário
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuário escolher uma das opções
        System.out.print("Escolha um personagem: ");
        int escolhaDoUsuario = scanner.nextInt();

        //Reação ao escolher um usuário
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki.");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha.");
                break;
            case 3:
                System.out.println("O usuário escolheu o Sakura Haruno.");
                break;
            default:
                System.out.println("Resposta inválida.");
        }

        scanner.close();
    }

}
