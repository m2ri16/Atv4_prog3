//Elabore um programa que leia um número inteiro de 1 a 5 e exiba a mensagem "Muito bom", "Bom", "Regular",
// "Insuficiente" ou "Muito insuficiente", de acordo com o valor lido, utilizando switch/case.

import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 5: ");
        int n = s.nextInt();

        switch (n) {
            case 1:
                System.out.println("Muito bom.");
                break;
            case 2: 
            System.out.println("Bom.");
                break;
            case 3: 
                System.out.println("Regular.");
                break;
            case 4: 
            System.out.println("Insuficiente.");
                break;
            case 5: 
                System.out.println("Muito insuficiente.");
                break;
            
            default:
                System.out.println("Numero invalido.");
                break;
        }
        s.close();
    }
}
