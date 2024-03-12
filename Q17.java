import java.util.Arrays;
import java.util.Scanner;

public class Q17 {
    public static void q17(){
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[5];
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número");
            int num = in.nextInt();
            vetor[i]=num;
        } 
        in.close();
        System.out.println("Aqui está o vetor: " + Arrays.toString(vetor));
    }
    public static void main(String[] args) {
        q17();
    }
}
