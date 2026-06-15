import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int letters = 0, spaces = 0, numbers = 0, others = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch))
                letters++;
            else if (Character.isDigit(ch))
                numbers++;
            else if (Character.isSpaceChar(ch))
                spaces++;
            else
                others++;
        }
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
        sc.close();
    }
}