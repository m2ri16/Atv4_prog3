//Peça ao usuário que digite um número entre 1 e 7 e exiba o dia da semana correspondente (1 -Domingo, 2 - Segunda-feira, etc.).

import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 7: ");
        int dia = s.nextInt();

        switch (dia) {
            case 1:
            System.out.println("Domingo.");
            break;
        case 2: 
        System.out.println("Segunda-feira.");
            break;
        case 3: 
            System.out.println("Terça-feira.");
            break;
        case 4: 
        System.out.println("Quarta-feira.");
            break;
        case 5: 
            System.out.println("Quinta-feira.");
            break;
        case 6:
            System.out.println("Sexta-feira.");
            break;
        case 7:
            System.out.println("Sabado.");
            break; 
        default:
            System.out.println("Numero invalido.");
            break;
        }
    }
}
