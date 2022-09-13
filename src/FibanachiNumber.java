import java.util.Scanner;

public class FibanachiNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        int d = 0;
        while (d < n) {
            a = b;
            b = c;
            c = a + b;
            d++;
        }
        System.out.println(c);
    }
}
