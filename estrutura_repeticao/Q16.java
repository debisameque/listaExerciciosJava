import java.util.Scanner;

public class Q16 {
    public static void q16() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int numero = in.nextInt();
        while (numero < 0) {
            System.out.println("Esse não vale, digite um número inteiro positivo: ");
            numero = in.nextInt();
        }
        in.close();
        int resultado = 1;
        for (int f = 1; f <= numero; f++) {
            resultado *= f;
        }
        System.out.println("O resultado do fatorial do " + numero + " é " + resultado);
    }

    public static void main(String[] args) {
        q16();
    }
}
