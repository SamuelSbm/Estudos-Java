package df13;

public class Funcao01 {
    public static void main(String[] args) {

        Fatorial f = new Fatorial();
        f.setValue(5);
        System.out.printf(f.getFormula());
        System.out.println(f.getFactorial());
    }
}
