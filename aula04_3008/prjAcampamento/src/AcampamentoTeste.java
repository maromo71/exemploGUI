public class AcampamentoTeste {
    public static void main(String[] args) {
        Acampamento membro = new Acampamento();
        membro.setNome("Carlos Roberto");
        membro.setIdade(63);
        System.out.println(membro);
        membro.separarGrupo();
        System.out.println(membro);
    }
}