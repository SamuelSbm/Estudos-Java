package ex09;

import java.util.Arrays;

public class Vetor05 {
    public static void main(String[] args) {
        int v[] = new int [20];
        Arrays.fill(v, 0);       // Para preencher o vetor com o valor determinado
        for (int valor: v){
            System.out.print(valor + " ");
        }
    }
}
