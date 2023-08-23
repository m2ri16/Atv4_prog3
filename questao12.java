import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = s.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Esse número é divisivel por 3 e 5.");
        } else {
            System.out.println("Esse número não é divisivel por 3 e 5. ");
        }
        s.close();
    }
}
