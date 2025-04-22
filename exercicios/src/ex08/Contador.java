package ex08;

public class Contador {
    public static void main(String[] args) {
        int cc = 0;
        while (cc<10){
            cc++;
            if (cc == 2 || cc == 3 || cc == 4){
                continue;
            }
            if (cc == 7) {
                break;
            }
            System.out.println("Cambalhota" + cc);
        }
    }
}


// "continue" usado para interromper o fluxo do comando e retornar ao while "enquanto"
// "break" usado para interromper o fluxo e finalizar o programa
