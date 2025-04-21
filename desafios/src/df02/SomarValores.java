package df02;

import java.util.Scanner;

public class SomarValores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        String valor = input.nextLine();

        System.out.print("Digite outro valor: ");
        String valorTwo = input.nextLine();

        int value = Integer.parseInt(valor);
        int valueTwo = Integer.parseInt(valorTwo);
        int resultado = value + valueTwo;

        System.out.println("Resultado " + resultado);

    }
}
