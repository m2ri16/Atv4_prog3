//Peça ao usuário que insira a sua idade e verifique se ele é um bebê (0 a 1 ano), criança (1 a 12 anos), adolescente (13 a 18 anos) ou adulto (mais de 18 anos).
import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Insira sua idade: ");
        int idade = s.nextInt();

        if (idade == 0 || idade == 1 ) {
            System.out.println("Bebê.");
        } else if (idade > 1 && idade <= 12) {
            System.out.println("Criança.");
        } else if (idade > 13 && idade <= 18) {
            System.out.println("Adolecente.");
        } else if (idade > 18) {
            System.out.println("Adulta.");
        } else {
           System.out.print("Idade inválida."); 
        }   
        s.close();
    }
}
