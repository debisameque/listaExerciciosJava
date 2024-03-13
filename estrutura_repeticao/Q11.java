import java.util.Scanner;

public class Q11 {
    public static void q11(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 10: ");
        int numero = in.nextInt();
        in.close();
        if(numero >= 0 && numero <= 10){
            for(int x = 0; x <= 10; x++){
                int tabuada = numero*x;
                System.out.println(numero + " X " + x + " = " + tabuada); 
                }
        }else{
            System.out.println("Esse número não vale.");
        } 
    }
    public static void main(String[] args) {
        q11();
    }
}
