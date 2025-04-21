package ex04;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);

        int numero = 10;
        int valor = 4 + numero++;                 // ++ " incrementar - a = a + 1
        System.out.println(valor);                // -- " decremento - a = a - 1
    }
}
        /* double aleatorio = Math.random();      gerador de numero aleatorio
           int numero = (int) (5 + aleatorio * (10-5);   numero aleatorio entre 5 e 10
           */