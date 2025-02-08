package NivelIntermediario;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    private List<T> equipamentosNinja = new ArrayList<>();
    public void adicionaEquipamentoNinja(T equipamento) {
        this.equipamentosNinja.add(equipamento);
        System.out.println(equipamento.toString() + " adicionado com sucesso.");
    }

    public List<T> getEquipamentosNinja() {
        return equipamentosNinja;
    }

    @Override
    public String toString() {
        return getEquipamentosNinja().toString();
    }
}
