import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu salario: ");
        double salario = s.nextDouble();
        double aumento;

        if (salario >= 1500) {
            aumento = salario * 1.10;
        } else {
            aumento = salario * 1.15;
        }
        System.out.println("O seu salario com aumento ficara " + aumento);
        s.close();

    }
}
