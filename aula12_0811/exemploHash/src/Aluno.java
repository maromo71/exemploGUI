import java.util.Objects;

public class Aluno {
    private int ra;
    private String nome;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return ra == aluno.ra;
    }

    @Override
    public int hashCode() {
        return nome.length();
    }

    @Override
    public String toString() {
        return  "Ra: " + ra + "\n" +
                "Nome: " + nome + "\n";
    }
}
