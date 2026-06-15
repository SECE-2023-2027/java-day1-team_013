import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b1 = sc.next();
        String b2 = sc.next();

        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);

        int sum = n1 + n2;

        System.out.println(Integer.toBinaryString(sum));
    }
}