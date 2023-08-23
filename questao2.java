//Crie um programa que receba a idade de uma pessoa e exiba se ela é maior de idade ou menor de idade.
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade");
        }
        s.close();
    }
}
