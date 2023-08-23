//Faça um programa que receba três números e os imprima em ordem crescente.
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = s.nextInt();
        
        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println("A ordem dos numeros é " + n1 + ", " + n2 + ", " + n3 + ".");
            } else {
                System.out.println("A ordem dos numeros é " + n1 + ", " + n3 + ", " + n2 + ".");
            }
        }
        if (n2 < n1 && n2 < n3) {
             if (n1 < n3) {
                System.out.println("A ordem dos numeros é " + n2 + ", " + n1 + ", " + n3 + ".");
            } else {
                System.out.println("A ordem dos numeros é " + n2 + ", " + n3 + ", " + n1 + ".");
            }
        }
         if (n3 < n1 && n3 < n2) {
             if (n1 < n2) {
                System.out.println("A ordem dos numeros é " + n3 + ", " + n1 + ", " + n2 + ".");
            } else {
                System.out.println("A ordem dos numeros é " + n3 + ", " + n2 + ", " + n1 + ".");
            }
        }
        s.close();
    }
}
