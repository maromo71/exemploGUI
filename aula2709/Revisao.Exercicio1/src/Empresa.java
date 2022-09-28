import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private int idEmpresa;
    private String razaoSocial;
    private List<Funcionario> empregados = new ArrayList<>();
    private String cnpj;

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public List<Funcionario> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(List<Funcionario> empregados) {
        this.empregados = empregados;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void mostraEmpregado(){
        //varre a lista para mostrar todos os empregados
        //da empresa
        System.out.println("Empresa: " + razaoSocial);
        System.out.println("Total de funcionarios: ");
        System.out.println(this.empregados.size());
        for(Funcionario f: empregados){
            f.imprimir();
        }
        System.out.println("------------------------");
    }

    public boolean contemEmpregado(Funcionario f){
        for (Funcionario func: empregados) {
            if(f.getIdFunc()==func.getIdFunc())return true;
        }
        return false;
    }

    public void adicionarEmpregado(Funcionario f){
        empregados.add(f);
        System.out.println("Funcionario Adicionado");
    }
}
