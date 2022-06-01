/*https://www.acmicpc.net/problem/2588*/

package level_1;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        String num2 = "";

        num1 = scan.nextInt();
        num2 = scan.next();
        scan.close();

        System.out.println(num1 * (num2.charAt(2) - '0'));
        System.out.println(num1 * (num2.charAt(1) - '0'));
        System.out.println(num1 * (num2.charAt(0) - '0'));

        System.out.println(num1 * Integer.parseInt(num2));
    }
}
