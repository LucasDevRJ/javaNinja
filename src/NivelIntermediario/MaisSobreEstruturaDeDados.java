package NivelIntermediario;

import java.util.*;

public class MaisSobreEstruturaDeDados {
    public static void main(String[] args) {
        System.out.println("--------------------|ARRAY|--------------------");
        /*
            São mais usados quando sabemos qual tamanho queremos
            Em situações mais simples
            Temos que passar o número total de alocação de memória
            Caso seja passado um número maior do que realmente foi usado, o espaço será criado, porém com valor nulo
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
            Consegue importar várias funções das Collections
            Pode aumentar e diminuir de tamanho de acordo a demanda
            São mais lentas em comparação com Array
            Uma das mais usadas na programação
            O primeiro a entrar e o último a sair (FILO)
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

        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("--------------------|Queue|--------------------");
        /*
            Primeiro elemento que entrar será o primeiro a sair (FIFO). Como em uma fila.
            Head é o primeiro elemento da fila. Já o Tail é o último da fila.
            São basicamente como as Stacks, só que ao inverso.
         */
        Queue<String> queueNinja = new LinkedList<>();
        queueNinja.add("Naruto");
        queueNinja.add("Sasuke");
        queueNinja.add("Sakura");
        queueNinja.add("Kakshi");
        queueNinja.add("Shikamaru");

        //Exibir os ninjas do Queue
        System.out.println("Queue de Ninjas = " + queueNinja);

        //Tirar o Head da fila
        System.out.println("Removendo o Head da fila = " + queueNinja.poll());
        System.out.println("Queue de Ninjas após a remoção = " + queueNinja);

        System.out.println("Exibindo o primeiro da lista Queue = " + queueNinja.peek());

        queueNinja.add("Hashirama");
        queueNinja.add("Tobirama");

        System.out.println("Queue de Ninjas após as duas inserções = " + queueNinja);

        System.out.println("A fila Queue de Ninjas esta vázia = " + queueNinja.isEmpty());

        for (int i = 0; i <= queueNinja.size(); i++) {
            queueNinja.poll();
        }
        queueNinja.poll();
        queueNinja.poll();
        System.out.println("Queue de Ninjas = " + queueNinja);

        System.out.println("A fila Queue de Ninjas esta vázia = " + queueNinja.isEmpty());

        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("--------------------|LinkedList|--------------------");
        /*
            Ao invés de utilizar índices para percorrer os elementos, possui ponteiros
            que apontam para o próximo elemento da lista
            Ótimo para percorrer elementos, pois não precisa ficar mudando as posições dos elementos
            Tem menos processamento de computação, pois tem as referências
         */
        LinkedList<String> linkedListNinja = new LinkedList<>();
        linkedListNinja.add("Madara Uchiha");
        linkedListNinja.add("Kagami Uchiha");
        linkedListNinja.add("Izuna Uchiha");
        linkedListNinja.add("Fugaku Uchiha");
        linkedListNinja.add("Baru Uchiha");
        linkedListNinja.add("Tajima Uchiha");

        System.out.println("Exibindo os ninjas da LinkedList = " + linkedListNinja);

        linkedListNinja.add(2, "Hikaku Uchiha");
        System.out.println("Adicionando o Hikaku Uchiha no segundo índice.");

        System.out.println("Exibindo os ninjas da LinkedList = " + linkedListNinja);

        System.out.println("Adicionando o Tajima Uchiha no quinto indice.");
        linkedListNinja.add(5, "Tajima Uchiha");
        System.out.println("Exibindo os ninjas da LinkedList = " + linkedListNinja);

        System.out.println("Removendo Baru Uchiha(sexto índice)");
        linkedListNinja.remove(6);
        System.out.println("Exibindo os ninjas da LinkedList = " + linkedListNinja);

        /*
            Tanto a ArrayList e LinkeList são Collections
            Collections são interfaces implementadas pelas estruturas de dados do Java
            As estruturas de dados que implementam Collections = List, Queue e Set
            Os ArrayList, LinkedList e Stack são classes que implementam a List, a qual implementa a Collections
            A Queue é uma interface que implementa a Collections e a PriorityQueue implementa a Queue
         */

        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("--------------------|HashSet|--------------------");

        /*
            A grande vantagem do HashSet em relação a Listas é que ele ignora itens duplicados dentro da lista
            Ele não usa índices, então não temos ordenação
         */
        Set<String> hashNinjas = new HashSet<>();
        hashNinjas.add("Naruto Uzumaki");
        hashNinjas.add("Sakura Haruno");
        hashNinjas.add("Sasuke Uchiha");
        hashNinjas.add("Kakashi Hatake");
        hashNinjas.add("Naruto Uzumaki"); //não será adicionado

        System.out.println("HashSet dos Ninjas = " + hashNinjas);

        hashNinjas.remove("Sakura Haruno"); //para remover

        System.out.println("HashSet dos Ninjas após remoção = " + hashNinjas);

    }
}
