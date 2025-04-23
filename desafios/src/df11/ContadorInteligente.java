package df11;

import java.util.Scanner;

public class ContadorInteligente {

    // Receber um numero inicial de 1 a 5, e caso seja digitado um valor acima do determiado receba um aviso e reinicie o loop - ok
    // Determinar o limite maximo de contagem 1 a 20 - ok
    // Determinar o passo da contagem 1 a 4 - ok
    // Imprimir para o usuario - ok

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  start = 0, end = 0, pass = 0;

        do {
            System.out.println("Informe um valor: ");
            start = sc.nextInt();
            if (start > 5 || start < 1){
                System.out.println("Informe um valor entre 1 e 5: ");
            }
        } while (start > 5 || start < 1);

        do {
            System.out.println("Digite o fim: ");
            end = sc.nextInt();

            if (end > 20 || end < 1){
                System.out.println("Informe o valor entre 1 e 20: ");
            }
        } while (end > 20 || end < 1);

        do {
            System.out.println("Passo: ");
            pass = sc.nextInt();

            if (pass > 4 || pass < 1){
                System.out.println("Informe o valor entre 1 e 4: ");
            }
        } while (pass > 4 || pass < 1);

        for (int counter = start; counter <= end; counter += pass) {
            System.out.println(counter);
        }

    }
}
