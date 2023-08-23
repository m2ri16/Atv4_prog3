//Crie um programa que receba o nome de duas pessoas e exiba qual delas possui o maior número de caracteres em seu nome.
import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = s.next();
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = s.next();

        if (nome1.length() > nome2.length()) {
            System.out.println("O primeiro nome é maior que o segundo.");
        } else {
            System.out.println("O segundo nome é maior que o primeiro.");
        }
        s.close();
    }
}
