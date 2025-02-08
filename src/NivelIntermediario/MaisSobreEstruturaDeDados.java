package NivelIntermediario;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaisSobreEstruturaDeDados {
    public static void main(String[] args) {
        System.out.println("--------------------|ARRAY|--------------------");
        /*
            São mais usados quando sabemos qual tamanho queremos
            Em situações mais simples
         */
        //Array é estático, então não podem aumentar ou diminuir de tamanho
        //Temos que definir o tamanho dele(4)
        //Indices começam por 0, geralmente
        String[] arrayNinja = new String[4];
        //Assim que adicionamos valores em Array
        arrayNinja[0] = "Naruto Uzumaki";
        arrayNinja[1] = "Sakura Haruno";
        arrayNinja[2] = "Sasuke Uchiha";
        arrayNinja[3] = "Kakashi Hatake";

        System.out.println("Referência ao espaço em memória alocado = " + arrayNinja); //será exibido @65ab7765 que é a referência a memmória armazenada

        for (int i = 0; i < arrayNinja.length; i++) {
            //exibi o valor no array pelo índice
            System.out.println("Índice " + i + " = " + arrayNinja[i]);
        }

        //gerará o erro ArrayIndexOutOfBoundsException
        //Porque o Array não tem esse tamanho todo
        //para ser adicionado mais um ninja teria de aumentar o tamanho do Array
        //arrayNinja[4] = "Kiba Inuzuka";

        /*
            E se tentarmos exibir um indice com espaço vazio?
            O compilador irá devolver null, porque ele é o valor padrão
            pois não foi alocado o valor em tal espaço de memória
         */

        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("--------------------|LIST|--------------------");
        /*
            A List pode ser generica, caso nenhum dado seja passado
            Consegue importar várias funções do Java
            Pode aumentar e diminuir de tamanho de acordo a demanda
            São mais lentas em comparação com Array
            Uma das mais usadas na programação
         */
        List<String> listNinja = new ArrayList<>();
        listNinja.add("Shino Aburame");
        listNinja.add("Kiba Inuzuka");
        listNinja.add("Hinata Hyuuga");
        listNinja.add("Kurenai");
        /*
            Logo, caso seja alterado algum valor da lista
            será exibido sem precisar ficar chamando o listNinja
            e sem constar como null o valor
         */

        //Como ele já vem com método toString() alterado
        //Será exibido os valores da List
        System.out.println("Valores da List = " + listNinja);

        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("--------------------|Stacks|--------------------");
        /*
            São mutaveis conforme a demanda, então podem aumentar e diminuir de tamanho
            Só que funciona como uma pilha, ou seja, o primeiro a entrar e o último a sair
            pois a stack é vista da forma vertical ao invés de horizontal, ou seja, é vista de baixo para cima
            Analogia: imagina que esteja empilhando objetos. O último objeto que empilhou, será o primeiro a desempilhar
            e o primeiro empilhado será o último a desempilhar
         */

        Stack<String> stackNinja = new Stack<>();
        //para adicionar elementos
        stackNinja.push("Asuma Sarutobi");
        stackNinja.push("Shikamaru Nara");
        stackNinja.push("Ino");
        stackNinja.push("Choouji Akimichi");

        System.out.println("Stack atual = " + stackNinja);
        System.out.println("Removendo o " + stackNinja.pop()); //pois foi o último adicionado
        System.out.println("Stack após remoção = " + stackNinja);
        System.out.println("Adicionando o " + stackNinja.push("Guy")); //vai virar o último, ou primeiro se vista da direita para esquerda
        System.out.println("Stack após adição = " + stackNinja);
        System.out.println("Primeiro ninja da lista = " + stackNinja.peek()); //exibe o Guy, porque foi o último a ser adicionado
    }
}
