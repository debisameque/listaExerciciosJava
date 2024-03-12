import java.util.Scanner;

public class Q12 {
    public static void q12() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma nota de 0 a 10: ");
        int nota = in.nextInt();

        while (nota > 10 || nota < 0) {
            System.out.println("Essa nota não vale. Digite uma nota de 0 a 10: ");
            nota = in.nextInt();
        }
        in.close();
        System.out.println(nota + " é uma nota válida.");
    }

    public static void main(String[] args) {
        q12();
    }
}
