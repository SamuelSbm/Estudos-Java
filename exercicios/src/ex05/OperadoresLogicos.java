package ex05;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        //r = (x<y && y==z)?true:false;
        //r = (x<y || y==z)?true:false;
        r = (x<y ^ y<z)?true:false;
        System.out.println(r);
    }
}
