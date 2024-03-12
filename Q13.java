import java.util.Scanner;

public class Q13 {
    public static void q13() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número de candidatos a votar: ");
        int eleitores = in.nextInt();
        int fulano = 0;
        int cicrano = 0;
        int beltrano = 0;
        for (int x = 0; x < eleitores; x++) {
            System.out.println("Eleitor " + x + " digite o número do seu candidato (1 para Fulano / 2 para Cicrano / 3 para Beltrano): ");
            int voto = in.nextInt();
            if (voto == 1) {
                fulano += 1;
            } else if (voto == 2) {
                cicrano += 1;
            } else {
                beltrano += 1;
            }
        }
        in.close();
        System.out.println("O número de votos para Fulano foi: " + fulano);
        System.out.println("O número de votos para Cicrano foi: " + cicrano);
        System.out.println("O número de votos para Beltrano foi: " + beltrano);
    }

    public static void main(String[] args) {
        q13();
    }
}
