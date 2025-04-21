package df07;

import java.util.Scanner;

public class CalculoDeBascara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Determines o valor de A, B e C respectivamente: ");

        int a, b, c;
        double delta, x1, x2;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        delta = (b * b) + (-4 * (a * c));
        System.out.println("Delta: " + delta);

        if (delta >=0){
            x1 = (double) ((-b + Math.sqrt(delta)) / 2 * a);
            x2 = (double) ((-b - Math.sqrt(delta)) / 2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Delta não possui raiz!");
        }


    }
}
