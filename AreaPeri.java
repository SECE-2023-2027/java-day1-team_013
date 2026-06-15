import java.util.Scanner;

public class AreaPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        System.out.println("Area: " + (Math.PI * r * r));
        System.out.println("Perimeter: " + (2 * Math.PI * r));

        sc.close();
    }
}