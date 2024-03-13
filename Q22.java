import java.util.Scanner;

public class Q22 {
    public static void q22(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = in.nextInt();
        String numberToString = String.valueOf(numero);

        String[] array1 = numberToString.split("");
        String[] array2 = new String[array1.length];
        int pos = 0;
        in.close();
        
        for(int i = array1.length-1; i >= 0; i--){
            array2[pos] = array1[i];
            pos++;
        }
        String resultado = String.join("",array2);
        int resultadoInt = Integer.valueOf(resultado);

        System.out.println("O número ao inverso fica: " + resultadoInt);
    }
    public static void main(String[] args) {
        q22();
    }
}
