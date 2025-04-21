package df06;

import java.util.Random;
import java.util.Scanner;

public class Genio {
    public static void main(String[] args) {

      while (true) {
          Random rand = new Random();
          Scanner sc = new Scanner(System.in);
          System.out.println("Estou pensando em um número entre 1 e 5. Tente adivinhar.");
          int num = sc.nextInt();
          int intRandom = rand.nextInt(5);

          if (num == intRandom) {
              System.out.println("Voçê acertou");
              break;
          } else {
              System.out.println("Errou, pensei em " + intRandom);
          }
      }
    }
}
