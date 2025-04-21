package ex07;

import java.util.Scanner;

public class ProgamaPernas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int lags = sc.nextInt();
        String type;
        System.out.println("Isso é um(a) ");

        switch (lags){
            case 1:
                type = "Saci";
                break;
            case 2:
                type = "Bípede";
                break;
            case 3:
                type = "Tripé";
                break;
            case 4:
                type = "Quadrúpede";
                break;
            case 6:
                type = "Aranha";
                break;
            default:
                type = "ET";
        }
        System.out.println(type);
    }
}
