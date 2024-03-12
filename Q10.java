import java.util.Scanner;

public class Q10 {
    public static void q10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro qualquer para saber se ele é par ou ímpar: ");
        int numero = in.nextInt();
        in.close();
        if(numero%2 == 0){
            System.out.println("O número é par.");
        }else{
            System.out.println("O número é ímpar.");
        }
    }

    public static void main(String[] args) {
        q10();
    }
}
