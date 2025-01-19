package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
            Dados não primitivos: String, Array, Class, enum
            Objetivo: criar um ninja, e atribuir métodos a ele
         */

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); //toUpperCase() vai colocar o nome em CAPSLOCK
        System.out.println("Nome: " + nome);
        System.out.println("Nome em maiusculo: " + nomeEmCaixaAlta);

        String aldeia = "Aldeia da Folha";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); //toLowerCase() vai deixar tudo em caixa baixa
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Aldeia em minusculo: " + aldeiaEmCaixaBaixa);

        String nome2 = "Sasuke";
        String cla = "Uchiha";

        //Concatena Strings
        System.out.println(nome2.concat(" ").concat(cla));

        int idade = 16;
        boolean ninjaRenegado = true;
        System.out.println("Idade: " + idade);
        System.out.println("Ninja Renegado: " + ninjaRenegado);
        String idadeConvertidaString = String.valueOf(idade); //converte int para String
        System.out.println("Idade Convertida em String: " + idadeConvertidaString);
        System.out.println("Booleano Convertida em String: " + String.valueOf(ninjaRenegado));
        System.out.println("Número de caracteres: " + nome2.length()); //mostra o número total de caracteres
        System.out.println("4 indice: " + nome2.charAt(4)); //retorna o índice, caso esteja correto
        System.out.println("Inicia com S: " + nome2.startsWith("S")); //verifica se a variável começa com o caractere
        System.out.println("Tem letra 'c' no clã?\n1 - true \n2 - false\n" + "Resposta: " + cla.indexOf("c")); //retorna 1 caso tenha o caractere, ou falso caso não tenha
        System.out.println("Pegando até o quarto indice: " + nome2.substring(0, 4)); //pegando o quarto índice da String
        System.out.println("Trocando o 's' por 'c': " + nome2.replace('s', 'c')); //substituindo o s por c

        String fraseMarcante = "       O ninja que quebra as regras é como lixo, mas é muito pior quem abandona os seus amigos      ";
        System.out.println("Removendo os espaços em branco: " + fraseMarcante.trim()); //removendo os espaços em branco no início e fim
    }
}
