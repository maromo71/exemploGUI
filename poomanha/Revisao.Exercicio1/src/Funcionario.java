import java.time.LocalDate;

public class Funcionario {
    private boolean estaAtivo;
    private String nomeFunc;
    private LocalDate dataContratacao;
    private String departamento;
    private String documento;
    private double salario; //nao coloquei na modelagem
    private int idFunc;

    public void atualizarSalario(double valor){
        this.salario = valor;
    }

    public void imprimir(){
        System.out.println("idFunc = " + idFunc);
        System.out.println("nomeFunc = " + nomeFunc);
        System.out.println("dataContratacao = " + dataContratacao);
        System.out.println("salario = " + salario);
    }

    public void demitirFuncionario(){
        this.estaAtivo = false;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }
}
