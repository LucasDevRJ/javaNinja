package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        //Criar o ninja Naruto - Naruto é um Objeto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Vila da Folha";
        Naruto.idade = 17;

        //Criar ninja Sasuke Uchiha - Sasuke é um Objeto
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Vila da Folha";
        Sasuke.idade = 18;

        //Aplicando métodos aos meus Objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        int anosQueFaltamParaSeTornarHokage = Sasuke.anosParaSeTornarHokage(30);
        System.out.printf("\nO %s tem %d anos de idade, então faltam %d anos para se tornar Hokage.", Sasuke.nome, Sasuke.idade,anosQueFaltamParaSeTornarHokage);

        //Criar Sakura Haruno
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Vila da Folha";
        Sakura.idade = 18;

    }
}
