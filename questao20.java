import java.util.Scanner;
//Desenvolva um programa que leia o nome e a idade de uma pessoa. Utilize o bloco try/catch para
//garantir que a idade digitada seja um valor inteiro válido.
public class questao20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu nome:");
        String nome = s.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();

        try {
            if (idade > 0) {
                System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
            } else {
                System.out.println("Idade inválida. ");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Ocorreu um problema na leitura dos dados.");
        }

        s.close();
    }
}
