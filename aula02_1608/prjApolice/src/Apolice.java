/**
 * @author Marcos Roberto de Moraes
 * @since 2022 Aug
 * @version 1.0 Beta
 */
public class Apolice {
    private String nomeSegurado;
    /**
     * Atributo idade: tipo de dado inteiro
     */
    private int idade;
    private float valorPremio;

    //métodos gets / sets

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

    /**
     * Método imprimir - lista todos os dados da apólice
     */
    void imprimir(){
        System.out.println("Nome: " + nomeSegurado);
        System.out.println("Idade: " + idade);
        System.out.println("Valor: " + valorPremio);
    }
}
