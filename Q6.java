import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Hexadecimal number is: " + Integer.toHexString(n).toUpperCase());

        sc.close();
    }
}