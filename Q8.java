import java.util.Scanner;

public class Q8 {
    public static void q08() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite aqui a primeira nota:");
        Float n1 = in.nextFloat();
        System.out.println("Digite aqui a segunda nota:");
        Float n2 = in.nextFloat();
        Float media = (n1 + n2) / 2;
        System.out.println("A média é: " + media);
        if (media >= 7) {
            System.out.println("O aluno foi aprovado!");
        } else {
            if (media >= 4) {
                System.out.println("O aluno ficou de AF. Digite a nota da AF: ");
                Float naf = in.nextFloat();
                Float mediaFinal = (media + naf) / 2;
                System.out.println("A média final do aluno foi: " + mediaFinal);
                if (mediaFinal >= 5) {
                    System.out.println("O aluno foi aprovado!");
                } else {
                    System.out.println("O aluno foi reprovado!");
                }
            } else {
                System.out.println("O aluno foi reprovado!");
            }

        }
        in.close();
    }

    public static void main(String[] args) {
        q08();
    }
}
