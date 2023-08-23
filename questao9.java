//Elabore um programa que calcule o IMC (Índice de Massa Corporal) de uma pessoa, dado o peso e a altura. Em seguida, exiba se a pessoa está abaixo do peso, com peso normal, com sobrepeso, obesa ou muito obesa.
import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = s.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = s.nextDouble();
        double IMC = peso / (Math.pow(altura, 2));

        if(IMC <= 18.5) {
           System.out.println("Baixo peso."); 
        } else if (IMC > 18.5 && IMC <= 24.99){
            System.out.println("Peso normal.");
        } else if(IMC > 25 && IMC <= 29.99 ){
            System.out.println("Sobrepeso.");
        } else if (IMC > 30 && IMC <= 34.99) {
            System.out.println("Obeso.");
        } else {
            System.out.println("Muito obeso.");
        }
        s.close();
    }
}
