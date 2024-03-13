import java.util.Scanner;

public class Q2 {
    public static void q02(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float n = in.nextFloat();
        System.out.println("O número informado foi: " + n);
        in.close();
    }
    public static void main(String[] args) {
        q02();
    }
}
