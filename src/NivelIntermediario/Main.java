package NivelIntermediario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Criar o ninja Naruto - Naruto é um Objeto
//        Uzumaki Naruto = new Uzumaki();
//        Naruto.nome = "Naruto Uzumaki";
//        Naruto.aldeia = "Vila da Folha";
//        Naruto.idade = 17;
//        Naruto.rank = NivelDoNinja.GENIN;
//        Naruto.saudacao();
//        Naruto.ModoSabioAtivado();
//        Naruto.atirarKunai();
        System.out.println("--------------------|NARUTO UZUMAKI|--------------------");
        Uzumaki uzumaki = new Uzumaki("Naruto Uzumaki", "Konoha", 16, 30, NivelDoNinja.GENIN);
        uzumaki.saudacao();
        uzumaki.estrategiaDeBatalhaNinja();
        uzumaki.habilidadeEspecial();
        uzumaki.ModoSabioAtivado();
        uzumaki.exibeQuantidadeDeMissoesFinalizadas();
        uzumaki.exibeRank();
        System.out.println("--------------------------------------------------------");

        //Criar ninja Sasuke Uchiha - Sasuke é um Objeto
        System.out.println("--------------------|SASUKE UCHIHA|--------------------");
        Uchiha Sasuke = new Uchiha();
//        Sasuke.nome = "Sasuke Uchiha";
//        Sasuke.aldeia = "Vila da Folha";
//        Sasuke.idade = 18;
//        Sasuke.altura = 1.70;
//        System.out.println(Sasuke.altura);
        Sasuke.setNome("Sasuke Uchiha");
        Sasuke.setAldeia("Vila da Folha");
        Sasuke.setIdade(18);
        Sasuke.saudacao();
        Sasuke.habilidadeEspecial();

        System.out.println("--------------------------------------------------------");


        //Aplicando métodos aos meus Objetos
        Sasuke.SharinganAtivado();
//        String chamandoMetodo = Sasuke.EuSouUmNinja();
//        System.out.println(chamandoMetodo);

        int anosQueFaltamParaSeTornarHokage = Sasuke.anosParaSeTornarHokage(30);
        System.out.printf("\nO %s tem %d anos de idade, então faltam %d anos para se tornar Hokage.\n", Sasuke.getNome(), Sasuke.getIdade(),anosQueFaltamParaSeTornarHokage);

        System.out.println("--------------------|SAKURA HARUNO|--------------------");
        //Criar Sakura Haruno
        Haruno Sakura = new Haruno();
//        Sakura.nome = "Sakura Haruno";
//        Sakura.aldeia = "Vila da Folha";
//        Sakura.idade = 18;
        Sakura.setNome("Sakura Haruno");
        Sakura.setAldeia("Vila da Folha");
        Sasuke.setIdade(18);
        Sakura.saudacao();
        Sakura.AtivarCura();
        Sakura.atirarKunai();
        Sakura.habilidadeEspecial();

        System.out.println("--------------------------------------------------------");

        //Objeto 4
        System.out.println("--------------------|HINATA HYUUGA|--------------------");
        Hyuuga Hinata = new Hyuuga();
//        Hinata.nome = "Hinata Hyuuga ";
//        Hinata.aldeia = "Aldeia da Folha";
//        Hinata.idade = 16;
        Hinata.setNome("Hinata Hyuuga");
        Hinata.setAldeia("Aldeia da Folha");
        Hinata.setIdade(16);
        Hinata.ativarByakugan();
        System.out.println("--------------------------------------------------------");


        System.out.println("--------------------|BORUTO UZUMAKI|--------------------");
        Boruto boruto = new Boruto();
//        boruto.nome = "Boruto Hyuuga Uzumaki";
//        boruto.idade = 16;
//        boruto.aldeia = "Konoha";
        boruto.setNome("Boruto Hyuuga Uzumaki");
        boruto.setIdade(16);
        boruto.setAldeia("Konoha");
        boruto.ativarKarma();
        boruto.ativarJougan();
        boruto.anosParaSeTornarHokage(25);
        System.out.println("--------------------------------------------------------");

//        System.out.println(boruto.EuSouUmNinja());

//        Naruto.habilidadeEspecial();

        System.out.println("--------------------|HASHIRAMA SENJU|--------------------");
        Senju hokage = new Senju();
        hokage.nome = "Hashirama";
        hokage.aldeia = "Konoha";
        hokage.altura = 1.70;
        hokage.vivo = false;
        hokage.idade = 40;
        hokage.saldoBancario = 100000;
        hokage.sabedoria();

        String frase = hokage.fraseDeHokage();
        System.out.println(frase);
        System.out.println("--------------------------------------------------------");

        //Não dá para criar instâncias de uma Classe Abstrata!
        //Usando Construtor
//        Hokage kokage2 = new Hokage("Tobirama Senju");
//        System.out.println(kokage2.nome);

//        Hokage hokage3 = new Hokage(70);
//        System.out.println("A idade do terceiro Hokage é " + hokage3.idade + " anos.");

//        Hokage hokage4 = new Hokage("Minato Namikaze", 30, false);
//        System.out.println(hokage4.nome);
//        System.out.println(hokage4.idade);
//        System.out.println(hokage4.vivo);

//        Uzumaki ninja = new Uzumaki();
////        ninja.nome = "Boruto Uzumaki";
////        ninja.aldeia = "Konoha";
////        ninja.idade = 12;
//        ninja.setNome("Boruto Uzumaki");
//        ninja.setAldeia("Konoha");
//        ninja.setIdade(12);
//        ninja.habilidadeEspecial();
//        ninja.estrategiaDeBatalhaNinja();

        System.out.println("--------------------|AKIMITCHI CHOOJI|--------------------");
        Akimichi akimichi = new Akimichi();
        akimichi.jogarShuriken();
        System.out.println("--------------------------------------------------------");

        System.out.println("--------------------|ITACHI UCHIHA|--------------------");
        Uchiha uchiha = new Uchiha("Uchiha Itachi", "Konoha", 23);
        uchiha.saudacao();
        uchiha.SharinganAtivado();
        uchiha.habilidadeEspecial();
        int quantidadeDeAnosQueFaltaParaVirarHokage = uchiha.anosParaSeTornarHokage(40);
        System.out.println("Faltam " + quantidadeDeAnosQueFaltaParaVirarHokage + " anos para o " + uchiha.getNome() + " vira Hokage.");
        System.out.println("--------------------------------------------------------");

        System.out.println("--------------------|KAKASHI HATAKE|--------------------");
        Hatake hatake = new Hatake("Kakashi Hatake", "Konoha", 25);
        hatake.saudacao();
        hatake.SharinganAtivado();
        hatake.ninjaDeElite();
        hatake.seTornarHokage();
        System.out.println("--------------------------------------------------------");

        System.out.println("--------------------|UCHIHA OBITO|--------------------");
        Uchiha uchiha1 = new Uchiha("Uchiha Obito", "Konoha", 13, 20, NivelDoNinja.GENIN);
        uchiha1.exibeRank();
        uchiha1.exibeQuantidadeDeMissoesFinalizadas();
        uchiha1.inteligenciaDeCombate();
        uchiha1.inteligenciaDeCombate(160);
        uchiha1.metodoProvisorio();
        System.out.println("--------------------------------------------------------");

        System.out.println("---------- Kushina Uzumaki ----------");
        Uzumaki uzumaki1 = new Uzumaki("Kushina Uzumaki", "Konoha", 30, 40, NivelDoNinja.CHUUNIN);
        //System.out.println(uzumaki1.nome); //A referência uzumaki1 é uma referência ao espaço alocado na memória, que guarda esse Objeto
        System.out.println(uzumaki1); //O @ seguido de vários valores é o valor referência do espaço armazenado na memória para o Objeto
        System.out.println("--------------------------------------------------------");

        System.out.println("---------- Shisui Uchiha ----------");
        Uchiha uchiha2 = new Uchiha("Shisui Uchiha", "Konoha", 17, 120, NivelDoNinja.JOUNIN);
        System.out.println(uchiha2.toString()); //mesmo que colocar somente o uchiha2

        System.out.println();
        System.out.println("---------|Testando método da classe mãe com final|---------");
        uzumaki.atirarKunai();

        System.out.println();
        System.out.println("---------|Testando Classe Final|---------");
        Anbu anbu = new Anbu("Sai");
        anbu.saudacaoAnbu();
        System.out.println();

        System.out.println("--------------------|MISSÃO|--------------------");
        Missoes missao = new Missoes("Defender Konoha da vilã do Som", RankDeMissoes.S);
        missao.exibirDetalhes();

        System.out.println();
        Missoes missao2 = new Missoes("Ajudar senhora a cortar a grama", RankDeMissoes.D);
        missao2.exibirDetalhes();

        System.out.println("--------------------|BIJUU|--------------------");
        System.out.println(Bijuus.GYUUKI);
        System.out.println();
        System.out.println(Bijuus.ISOBU);

        System.out.println();
        System.out.println("--------------------|Naruto Final Classe|--------------------");
        Naruto naruto = new Naruto();
        naruto.apresentacao();

        System.out.println();
        System.out.println("--------------------|Array|--------------------");
        //Arrays são estáticos, por isso não alteram de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Shikamaru";
        ninjasArray[1] = "Kiba";
        ninjasArray[2] = "Choouji";

        System.out.println("Referência de memória = " + ninjasArray);

        System.out.println("Ninjas do Array:");
        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println(ninjasArray[i]);
        }

        System.out.println("--------------------|Listas|--------------------");
        //Listas não são estáticas, elas podem aumentar e diminuir de tamanho
        List<String> ninjasLista = new ArrayList<>();
        ninjasLista.add("Uchiha Shisui"); //adicionando ninja
        ninjasLista.add("Uchiha Itachi");
        ninjasLista.add("Uchiha Sasuke");

        System.out.println("Valores da lista = " + ninjasLista);

        ninjasLista.add("Inuzuka Kiba");
        ninjasLista.add("Hinata Hyuuga");

        System.out.println("Valores da lista = " + ninjasLista);

        ninjasLista.remove("Inuzuka Kiba"); //removendo

        System.out.println("Valores da lista = " + ninjasLista);

        ninjasLista.add("Son Goku");

        System.out.println("Valores da lista = " + ninjasLista);


        //editando elemento
        ninjasLista.set(4, "Naruto");

        System.out.println("Valores da lista = " + ninjasLista);

        //ver tamanho da lista
        System.out.println("Tamanho da lista = " + ninjasLista.size());

//        System.out.println(ninjasLista.get(9));

        System.out.println("--------------------|KUNAIS|--------------------");
        EquipamentosDeNinja kunai = new EquipamentosDeNinja("Kunai");
        EquipamentosDeNinja shuriken = new EquipamentosDeNinja("Shuriken");
        EquipamentosDeNinja pergaminho = new EquipamentosDeNinja("Pergaminho");

        BolsaGenerica<EquipamentosDeNinja> bolsa = new BolsaGenerica<>();
        bolsa.adicionaEquipamento(kunai);
        bolsa.adicionaEquipamento(shuriken);
        bolsa.adicionaEquipamento(pergaminho);
        System.out.println(bolsa);
    }
}
