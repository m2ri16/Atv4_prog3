//Desenvolva um programa que leia um caractere e verifique se ele é uma vogal ou uma consoante.
import java.util.Scanner;
public class questao7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu caractere: ");
        char c = s.next().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("O caractere é uma vogal.");
        } else {
            System.out.println("O caractere é uma consoante.");
        }

        s.close();
    }
}
