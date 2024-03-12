import java.util.Scanner;

public class Q4 {
    public static void q04() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a metragem: ");
        float m = in.nextFloat();
        System.out.println(m + "m em centímetros fica " + m * 100 + "cm");
        in.close();
    }

    public static void main(String[] args) {
        q04();
    }
}
