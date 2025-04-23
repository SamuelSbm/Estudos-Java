package df10;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int count = 0;
        int sum = 0;
        int pair = 0;
        int odd = 0;
        int overHundred = 0;

        do {

            System.out.println("Informe um valor: \n");
            System.out.println("0 interrompe.");
            number = sc.nextInt();

            if (number !=0){

                sum += number;
                count++;

                if (number % 2 == 0){
                    pair++;
                } else{
                    odd++;
                }
                if (number >100){
                    overHundred++;
                }
            }
        } while (number !=0);

        double average = (double) sum / count;

        System.out.println("Resultado: \n");

        System.out.println("=========================");
        System.out.println("Total de Valores: " + count);
        System.out.println("Total de números Pares: " + pair );
        System.out.println("Total de números Ímpares: " + odd);
        System.out.println("Total de números acima de 100: " + overHundred);
        System.out.println("Média dos valores: " + average);
        System.out.println("=========================");
    }
}
