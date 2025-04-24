package ex10;

public class TesteFunção02 {

    public class Operacoes {
        public static String contador (int i, int f){
            String s = "";
            for (int c = i; c <= f; c++){
                s += c + " ";
            }
            return s;
        }

    }

    public static void main(String[] args) {
        System.out.println("Vai começar a contagem");
        System.out.println(Operacoes.contador(1,5));
    }
}
