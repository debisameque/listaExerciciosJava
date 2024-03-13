import java.util.Scanner;

public class Q6 {
    public static void q06(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o preço do primeiro produto: ");
        float p1 = in.nextFloat();
        System.out.println("Digite o preço do segundo produto: ");
        float p2 = in.nextFloat();
        System.out.println("Digite o preço do terceiro produto: ");
        float p3 = in.nextFloat();
        in.close();
        float menor = 0;
        String produto = "";
        if(p1 < p2){
            if(p1 < p3){
                menor = p1;
                produto = "primeiro produto";
            }else{
                menor = p3;
                produto = "terceiro produto";
            }
        }else{
            if(p2 < p3){
                menor = p2;
                produto = "segundo produto";
            }else{
                menor = p3;
                produto = "terceiro produto";
            }
        }
        System.out.println("O produto que você deve comprar é o " + produto + " com valor de " + menor + " reais");
    }
    public static void main(String[] args) {
        q06();
    }
}
