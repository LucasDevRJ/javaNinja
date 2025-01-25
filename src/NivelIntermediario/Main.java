package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        //Criar o ninja Naruto - Naruto é um Objeto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Vila da Folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        //Criar ninja Sasuke Uchiha - Sasuke é um Objeto
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Vila da Folha";
        Sasuke.idade = 18;

        //Aplicando métodos aos meus Objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        int anosQueFaltamParaSeTornarHokage = Sasuke.anosParaSeTornarHokage(30);
        System.out.printf("\nO %s tem %d anos de idade, então faltam %d anos para se tornar Hokage.\n", Sasuke.nome, Sasuke.idade,anosQueFaltamParaSeTornarHokage);

        //Criar Sakura Haruno
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Vila da Folha";
        Sakura.idade = 18;
        Sakura.AtivarCura();

        //Objeto 4
        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Hyuuga ";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 16;
        Hinata.ativarByakugan();
    }
}
