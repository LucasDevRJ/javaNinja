package NivelIntermediario;

import java.util.ArrayList;
import java.util.List;

/*
    Essa classe é generica, portanto pode utilizar Orientação a Objetos com todas as classes
 */
public class BolsaGenerica<T> {
    private List<T> equipamentos = new ArrayList<>();

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public void adicionaEquipamento(T equipamento) {
        this.equipamentos.add(equipamento);
    }

    public void exibirEquipamentosDaBolsa() {
        System.out.print("Na bolsa do Ninja tem: ");
        for (int i = 0; i < this.getEquipamentos().size(); i++) {
            System.out.printf("%s, ", this.getEquipamentos().get(i).toString());
        }
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + getEquipamentos();
    }
}
