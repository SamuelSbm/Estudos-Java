package ex10;

public class TesteFunção01 {

    static int soma(int a, int b){
        int sum = a + b;
        //System.out.println("A soma é " + sum);
        return sum;
    }
    public static void main(String[] args) {

        System.out.println("Começou o programa");
        int sm = soma (5,2);
        System.out.println("A soma vale " + sm);
    }
}
