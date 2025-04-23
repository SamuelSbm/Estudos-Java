package ex09;

public class Vetor02 {
    public static void main(String[] args) {
        String mes[] = {"Jan","Fev","Mar","Abr", "Mai",
             "Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot [] = {31, 28 , 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int count = 0; count<mes.length; count++){
            System.out.println("O mês de " + mes[count] + " tem " + tot[count] + " dias ao todo. ");

        }

    }
}
