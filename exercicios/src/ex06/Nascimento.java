package ex06;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Nascimento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digita seu ano de nascimento: ");
        LocalDateTime date = LocalDateTime.now();
        short idade = sc.nextShort();
        int year = date.getYear();
        int calc = (year - idade);

        if (calc >= 18){
            System.out.print("Maior de idade!");
        } else {
            System.out.print("Menor de idade!");
        }


    }
}
