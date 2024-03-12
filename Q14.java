import java.util.Scanner;

public class Q14 {
    public static void q14() {
        //criei o array com 10 números/posições
        int[] numeros = new int[10];
        Scanner in = new Scanner(System.in);
        for (int x = 0; x < 10; x++) {
            System.out.println("Digite um número maior que 1:");
            numeros[x] = in.nextInt();
        }
        in.close();
        //percorre o array para testar se é primo
        for (int x = 0; x < 10; x++) {
            Boolean isPrime = testaPrimo(numeros[x]);
            if(isPrime){
                System.out.println("O número " + numeros[x] + " é primo");
            }else{
                System.out.println("O número " + numeros[x] + " não é primo");
            }
        }
    }
    //função para teste de primalidade
    public static Boolean testaPrimo(int numero) {
        if (numero <= 1) {
            return false;// não é primo
        }

        for (int j = 2; j <= Math.sqrt(numero); j++) {
            if (numero % j == 0) {
                return false;// não é primo
            }
        }
        return true;// é primo
    }

    public static void main(String[] args) {
        q14();
    }
}
