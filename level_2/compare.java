package level_2;

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2 = 0;

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        scan.close();

        if (num1 > num2) {
            System.out.println(">");
        } else if (num1 < num2) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }
    }
}
