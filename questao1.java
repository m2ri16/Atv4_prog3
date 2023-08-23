//Escreva um programa que leia um número inteiro e verifique se ele é positivo, negativo ou igual a zero.
import java.util.Scanner;

public class questao1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int n = s.nextInt();

        if (n > 0 ) {
            System.out.println("O número inteiro inserido é positivo.");
        } else if(n == 0){
            System.out.println("O número inserido é zero.");
        } else{
            System.out.println("O número inteiro inserido é negativo.");
        }
        s.close();
    }

}