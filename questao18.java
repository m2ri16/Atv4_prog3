//18. Peça ao usuário que insira o seu estado civil e, usando a estrutura switch/case, exiba uma
//mensagem informando se é solteiro, casado, divorciado ou viúvo.

import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira o seu estado civil: ");
        String estadoCivil = s.next();

        switch (estadoCivil) {
            case "solteiro":
                System.out.println("Você é solteiro.");
                break;
            case "casado": 
                System.out.println("Você é casado.");
                break;
            case "divorciado": 
                System.out.println("Você é divorciado.");
                break;
            case "viúvo": 
                System.out.println("Você é viúvo.");
                break;
            default:
                System.out.println("Inválido.");
                break;
        }
        s.close();

    }
}
