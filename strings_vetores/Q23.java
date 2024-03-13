import java.util.Scanner;

public class Q23 {
    public static void q23() {
        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite um número: ");
        double numero1 = in.nextInt();

        System.out.println("\nDigite outro número: ");
        double numero2 = in.nextInt();

        System.out.println("\n1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("\nDigite o número da operação que deseja fazer com os números " + numero1 + " e " + numero2
                + " passados: ");

        int operacao = in.nextInt();
        in.close();

        switch (operacao) {
            case 1:
                double soma = numero1 + numero2;
                System.out.println("\nO resultado da soma é: " + soma);
                break;
            case 2:
                double subtracao = numero1 - numero2;
                System.out.println("\nO resultado da subtração é: " + subtracao);
                break;
            case 3:
                double multiplicacao = numero1 * numero2;
                System.out.println("\nO resultado da multiplicação é: " + multiplicacao);
                break;
            case 4:
                double divisao = numero1 / numero2;
                System.out.println("\nO resultado da divisao é: " + divisao);
                break;

            default:
                System.out.println("\nOperação inválida. Tente novamente.");
                break;
        }

    }

    public static void main(String[] args) {
        q23();
    }
}
