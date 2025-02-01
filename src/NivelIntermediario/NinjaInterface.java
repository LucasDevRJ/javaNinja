package NivelIntermediario;

public interface NinjaInterface {
    //é obrigatório a implementação dos métodos na Interface
    //não dá para setar os atributos após instâncias, pois interface é FINAL
    String nome = "Chouji Akimichi"; //só dá para settar agora
    void jogarShuriken();
}
