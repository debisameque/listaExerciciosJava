import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q20 {
    public static void q20() {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[20];
        List<Integer> vetorPar = new ArrayList<>();
        List<Integer> vetorImpar = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número");
            int num = in.nextInt();
            vetor[i] = num;
        }
        in.close();
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] % 2 == 0) {
                vetorPar.add(vetor[j]);
            } else {
                vetorImpar.add(vetor[j]);
            }
        }
        System.out.println("Aqui está o vetor de números: " + Arrays.toString(vetor));
        System.out
                .println("Aqui está o vetor de números pares: " + Arrays.toString(convertArrayListIntoArray(vetorPar)));
        System.out.println(
                "Aqui está o vetor de números ímpares: " + Arrays.toString(convertArrayListIntoArray(vetorImpar)));
    }

    static int[] convertArrayListIntoArray(List<Integer> vetor) {
        int[] novoVetor = new int[vetor.size()];
        int i = 0;

        for (int elemento : vetor) {
            novoVetor[i] = elemento;
            i++;
        }
        
        return novoVetor;
    }

    public static void main(String[] args) {
        q20();
    }
}
