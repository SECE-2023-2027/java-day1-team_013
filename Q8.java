import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();

        System.out.println("Decimal Number: " + Integer.parseInt(binary, 2));

        sc.close();
    }
}