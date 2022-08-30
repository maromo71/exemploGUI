public class Acampamento {
    private String nome;
    private char equipe;
    private int idade;


    //Métodos getter/setter


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getEquipe() {
        return equipe;
    }

    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    @Override
    public String toString() {
        return "Nome do Membro: " + nome  + "\n" +
                "Equipe: " + equipe + "\n" +
                "Idade: " + idade + "\n";
    }

    public void separarGrupo(){
        if(idade < 6){
            equipe = '-';
        } else if (idade < 11) {
            equipe = 'A';
        } else if (idade < 21) {
            equipe = 'B';
        }else{
            equipe = 'C';
        }
    }
}
