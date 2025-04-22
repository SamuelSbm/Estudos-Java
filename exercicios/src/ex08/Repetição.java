package ex08;

import java.util.Scanner;

public class Repetição {
    public static void main(String[] args) {
        int n, s=0;
        String resp;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            s += n;          // s = s + n
            System.out.print("Quer continuar? [S/N]");                  // exemplo - 2
            resp = sc.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);

    }
}







//public static void main(String[] args) {
//        int cc = 0;
//        do {
//            System.out.println("cambalhota" + cc);                Exemplo - 1
//            cc++;
//        } while (cc<4);