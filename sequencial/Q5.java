import java.util.Scanner;

public class Q5 {
    public static void q05(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio do círculo = ");
        int raio = in.nextInt();
        System.out.println("A área do círculo é = " + Math.PI*Math.pow(raio, 2));
        in.close();
    }
    public static void main(String[] args) {
        q05();
    }
}
