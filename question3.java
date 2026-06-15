import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}