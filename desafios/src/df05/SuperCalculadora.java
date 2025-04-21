package df05;

import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number: ");
        Double num = sc.nextDouble();
        double divisao = num%2;
        double elevate = (double) Math.pow(num,3);
        double square = (double) Math.sqrt(num);
        double cube = (double)  Math.cbrt(num);
        double value = (double) Math.abs(num);

        System.out.printf("Resto da Divisão %.0f \n" , divisao);
        System.out.printf("Elevado ao cubo  \n" , elevate);
        System.out.printf("Raiz quadrada %.2f \n" , square);
        System.out.printf("Raiz cúbica %.2f \n", cube);
        System.out.printf("Valor absoluto %.0f \n" , value);

    }
}
