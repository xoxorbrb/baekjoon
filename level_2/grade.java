package level_2;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        num = scan.nextInt();

        scan.close();

        if (!(num > 0 && num < 100))
            System.out.println("잘못입력했습니다.");
        else if (num > 89)
            System.out.println("A");
        else if (num > 79)
            System.out.println("B");
        else if (num > 69)
            System.out.println("C");
        else if (num > 59)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
