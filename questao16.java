//Receba um número decimal do usuário e arredonde-o para o inteiro mais próximo usando a estrutura de controle try/catch para tratar exceções.

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        double n = s.nextDouble();
        try {
            int inteiro = (int) n;
            int arredondado = Math.round(inteiro);
            System.out.println("Número arredondado: " + arredondado + ".");
        } catch (Exception e) {
            System.out.println("Inválido.");
        }
        s.close();
    }
}
