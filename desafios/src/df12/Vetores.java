package df12;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

    // Receber os valores individuais para suas posições - ok
    // Remover um valor de determida posição caso queira
    // Ordenar os valores automaticamente - ok

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
                System.out.println("Digite o valor da posição " + i);
                vetor[i] = sc.nextInt();
        }

        Arrays.sort(vetor);

        for (int order: vetor){
            System.out.print(order + " ");
        }

    }
}