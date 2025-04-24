package df13;

public class Fatorial {

    private int num = 0;
    private int factorial = 1;
    private String formula = "";

    public void setValue(int number){

        num = number;
        int fact = 1;
        String multiplication = "";

        for (int counter = number; counter > 1; counter--){
            fact *= counter;
            multiplication += counter + " x ";
        }
        multiplication += "1 = ";
        factorial = fact;
        formula= multiplication;
    }
    public int getFactorial(){
        return factorial;
    }

    public String getFormula(){
        return formula;
    }
}
