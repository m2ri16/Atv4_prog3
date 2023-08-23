import java.util.Scanner;
//Solicite ao usuário dois números inteiros e, usando a estrutura switch/case, exiba o resultado da
//operação escolhida pelo usuário (1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão).

public class questao19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();
        System.out.println("Escolha a operação abaixo: ");
        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");
        System.out.print("Digite aqui: ");
        int operacao = s.nextInt();

        switch (operacao) {
            case 1:
                int soma = n1 + n2;
                System.out.println("Soma: " + soma);
                break;
            case 2: 
                int subtração = n1 - n2;
                System.out.println("Subtração: " + subtração);
                break;
            case 3:
                int multiplicação = n1 * n2;
                System.out.println("Multiplicação" + multiplicação);
                break;
            case 4: 
                int divisao = n1 / n2;
                System.out.println("Divisão: " + divisao);
                break;
            default:
                System.out.println("Inválido");
                break;
        }
        s.close();
    }
}
