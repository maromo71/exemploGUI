import java.util.Scanner;

public class ComputadorTeste {
    public static void main(String[] args) {
        //Definido um computador comp1
        Computador comp1 = new Computador();

        //Definido um computador comp1
        Computador comp2 = new Computador();

        //chamar um metodo auxiliar par ler o objto
        ler(comp1);

        //imprimir o objeto
        System.out.println(comp1);

        //calcular o valor do computador 1 de acordo com as regras
        comp1.calcularValor();

        //imprimir novamente o computador 1
        System.out.println(comp1);

        //chamar o método para ler os dados para o comp2
        ler(comp2);

        //imprimir o comp2
        System.out.println(comp2);

        //calcular o valor do computador 1 de acordo com as regras
        comp2.calcularValor();

        //imprimir o valor do comp2
        System.out.println(comp2);

        //testar o alterar valor passando um valor positivo
        //caso 1  - coloquei valor alterado
        if(comp2.alterarValor(5000.0)==1){
            System.out.println("Dados alterados com sucesso");
        }else{ //caso nao seja 1 o retorno, significa que é negativo o valor passado
            System.out.println("Dados invalidos");
        }

        //imprimir os dados do computador 2
        System.out.println(comp2);
    }

    //método estático para ler dados da tela
    //como são dois objetos, escrevemos um método
    //para passar a cada leitura o novo objeto.
    //simplifica o código.
    private static void ler(Computador comp) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o modelo do computador: ");
        comp.setModelo(leitor.nextLine());
        System.out.println("Digite a marca do computador: ");
        comp.setMarca(leitor.nextLine());
        System.out.println("Digite a cor do computador: ");
        comp.setCor(leitor.nextLine());
        System.out.println("Digite o num. serie do computador: ");
        comp.setNumeroSerie(Long.parseLong(leitor.nextLine()));
        System.out.println("Digite o preco do computador: ");
        comp.setPreco(Double.parseDouble(leitor.nextLine()));
        System.out.println("Dados cadastrados");

    }
}