import java.util.Scanner;

public class Q9 {
    public static void q09() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        Float n1 = in.nextFloat();
        System.out.println("Digite o segundo número: ");
        Float n2 = in.nextFloat();
        System.out.println("Digite o terceiro número: ");
        Float n3 = in.nextFloat();
        in.close();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("O maior número é: " + n1);
            } else {
                System.out.println("O maior número é: " + n3);
            }
        } else {
            if (n2 > n3) {
                System.out.println("O maior número é: " + n2);
            } else {
                System.out.println("O maior número é: " + n3);
            }
        }
    }

    public static void main(String[] args) {
        q09();
    }
}
