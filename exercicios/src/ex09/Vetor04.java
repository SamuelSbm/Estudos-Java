package ex09;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {

        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v: vet) {                  // mostrar os valores guardados no vetor
            System.out.print(v + " ");
        }
        System.out.println(" ");
        int p = Arrays.binarySearch(vet, 8);     // Usado para buscar o valor em um determinado bloco do vetor
        System.out.println("Encontrei o valor na posição " + p);
    }
}
