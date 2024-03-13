import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void q07() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite quantas notas serão utilizadas: ");
        int qntNotas = in.nextInt();
        double[] notas = new double[qntNotas];
        for (int x = 0; x < qntNotas; x++) {
            int posicao = x + 1;
            System.out.println("Digite a nota " + posicao + ": ");
            float n = in.nextFloat();
            notas[x] = n;
        }
        in.close();
        double soma = Arrays.stream(notas).sum();
        double media = soma / notas.length;
        System.out.println("A média do aluno foi: " + media);
        if (media >= 7) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }

    }

    public static void main(String[] args) {
        q07();
    }
}
