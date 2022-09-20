public class Aluno {

    private int ra;
    private String nome;
    private String usuario;
    private String senha;

    public Aluno(){
        System.out.println("Instanciado");
    }
    public Aluno(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    public Aluno(int ra, String nome, String usuario, String senha){
        this(usuario, senha);
        this.ra = ra;
        this.nome = nome;
    }
}
