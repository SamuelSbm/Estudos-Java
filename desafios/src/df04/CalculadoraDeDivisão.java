package df04;

import java.util.Scanner;

public class CalculadoraDeDivisão {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numerador:");
        long num = sc.nextLong();
        System.out.println("Digite um Denominador");
        long den = sc.nextLong();
        float divisao = (float) num/den;
        float resto = (float) num%den;

        System.out.printf ("Divisão %.0f resta %.0f ", divisao, resto);
    }
}
