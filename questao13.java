//Peça ao usuário que insira o dia da semana (por extenso) e, em seguida, exiba uma mensagem informando se é um dia útil ou um fim de semana.
import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o dia da semana por extenso: ");
        String dia = s.nextLine();
        
        if (dia.equals("sabado")|| dia.equals("domingo")) {
            System.out.println("É fim de semana.");
        } else{
            System.out.println("É dia util.");
        }
        s.close();
    }
}
