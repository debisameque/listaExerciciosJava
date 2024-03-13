import java.util.Arrays;
import java.util.Scanner;

public class Q19 {
    public static void q19(){
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0;
        int multiplicacao = 1;
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número");
            int num = in.nextInt();
            vetor[i]=num;
            soma += vetor[i];
            multiplicacao *= vetor[i];
        } 
        in.close();
        System.out.println("Aqui está o vetor: " + Arrays.toString(vetor));
        System.out.println("Aqui está a soma de todos os elementos do vetor: " + soma);
        System.out.println("Aqui está a multiplicação de todos os elementos do vetor: " + multiplicacao);
    }
    public static void main(String[] args) {
        q19();
    }
}
