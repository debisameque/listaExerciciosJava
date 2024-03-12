import java.util.Arrays;
import java.util.Scanner;

public class Q21 {
    public static void q21() {
        Scanner in = new Scanner(System.in);
        String[] palavra = new String[2];
        int comprimento = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println("Escreva algo: ");
            String word = in.nextLine();
            palavra[i] = word;
            comprimento = word.length();
            System.out.println(
                    "Esta é a string: " + palavra[i] + "." + " E este é seu comprimento: " + comprimento);
        }
        in.close();
        if(palavra[0].length() == palavra[1].length()){
            System.out.println("As strings informadas tem o mesmo tamanho.");
            if(palavra[0].equals(palavra[1])){
                System.out.println("E são iguais.");
            }
        }else{
            System.out.println("As strings informadas não possuem o mesmo tamanho.");
        }
            
    }

    public static void main(String[] args) {
        q21();
    }
}
