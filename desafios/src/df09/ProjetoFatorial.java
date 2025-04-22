package df09;

import java.util.Scanner;

public class ProjetoFatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int n = sc.nextInt();
        int fatorial = 1;
        int contador = n;

        while (contador>=1){
            fatorial *= contador;
            contador--;
        }
        System.out.println(fatorial);
    }
}
