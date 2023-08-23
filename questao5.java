//Elabore um programa que leia três notas de um aluno e calcule a média. Em seguida, exiba se o aluno está aprovado (média maior ou igual a 7) ou reprovado.
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a sua primeira nota: ");
        double n1 = s.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        double n2 = s.nextDouble();
        System.out.print("Digite a sua terceira nota: ");
        double n3 = s.nextDouble();
        double media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println("Você está aprovado!");
        } else {
            System.out.println("Você está reprovado.");
        }
        s.close();
    }
}
