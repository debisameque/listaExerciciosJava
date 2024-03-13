import java.util.Scanner;
public class Q3 {
    public static void q03() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        float n1 = in.nextFloat();
        System.out.println("Digite a nota 2: ");
        float n2 = in.nextFloat();
        System.out.println("Digite a nota 3: ");
        float n3 = in.nextFloat();
        float media = (n1 + n2 + n3) / 3;
        System.out.println("A média é " + media);
        in.close();
    } 
    public static void main(String[] args){
        q03();
    }
}