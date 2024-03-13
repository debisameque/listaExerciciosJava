import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void q18(){
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[10];
        for(int i = 9; i >= 0; i--){
            System.out.println("Digite um número real");
            int num = in.nextInt();
            vetor[i]=num;
        } 
        in.close();
        System.out.println("Aqui está o vetor: " + Arrays.toString(vetor));
    }
    public static void main(String[] args) {
        q18();
    }
}
