package NivelIntermediario;

/*
    Um Record em Java permite que com apenas poucas linhas de código coloquemos os atributos, construtor,
    método nativos como toString, equals. Tudo isso implicito. Bastando passar os parâmetros.

    * Todos os atributos são final por padrão, portanto os atributos são imutáveis
    * Mais utilizado para quando sabemos que serão valores constantes, como CPF, RG.
    * São parecidos com ENUM no caso do uso
 */
public record NinjaRecord(String nome, String email, String telefone) {
    public String emailEmCaixaAlta() {
        return this.email.toUpperCase();
    }
}
