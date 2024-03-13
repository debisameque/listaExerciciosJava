import java.util.Arrays;

public class Q15 {
    public static void q15() {
        int[] fibonacci = new int[10];

        for (int x = 0; x < 10; x++) {
            if (x < 2) {
                fibonacci[x] = x;
            } else {
                fibonacci[x] = fibonacci[x - 1] + fibonacci[x - 2];
            }
        }
        System.out.println("Os dez primeiros termos da sequência de Fibonacci são: " + Arrays.toString(fibonacci));
    }

    public static void main(String[] args) {
        q15();
    }
}
