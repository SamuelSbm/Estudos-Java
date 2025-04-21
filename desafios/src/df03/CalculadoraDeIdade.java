package df03;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class CalculadoraDeIdade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento:");
        short idade = input.nextShort();
        LocalDateTime x = LocalDateTime.now();
        int year = x.getYear();
        System.out.println("Ano atual " + year);
        System.out.println(year - idade);
    }
}

