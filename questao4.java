//Faça um programa que verifique se um número é par ou ímpar.
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int n = s.nextInt();

    	if (n % 2 == 0 ) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }
        s.close();
    }
}
