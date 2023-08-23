//Crie um programa que leia um valor em metros e o converta para centímetros, milímetros e
//quilômetros. Utilize o bloco try/catch para tratar possíveis exceções durante os cálculos.
import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o valor em metros:");
        double metros = s.nextDouble();

        try {
            double centrimetros = metros * 100;
            double milímetros = metros * 1000;
            double quilômetros = metros / 1000;
            System.out.println("Cm: " + centrimetros);
            System.out.println("Mm: " + milímetros);
            System.out.println("Km: " + quilômetros);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Ocorreu um problema na leitura dos dados.");
        }
        s.close();
    }
}
