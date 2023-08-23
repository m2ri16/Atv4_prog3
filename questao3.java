//Desenvolva um programa que leia dois números inteiros e mostre qual deles é o maior, ou se são iguais.
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else if(n1 == n2){
            System.out.println("Os números inseridos são iguais.");
        } else { 
        System.out.println("O segundo número é maior que o primeiro.");
        }
        s.close();
    }   
}
