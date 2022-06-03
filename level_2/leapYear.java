package level_2;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = 0;
        year = scan.nextInt();

        scan.close();

        if (!(year >= 0 && year <= 4000))
            System.out.println("잘못입력했습니다.");
        else if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0)
            System.out.println("윤년입니다.");
        else
            System.out.println("윤년이 아닙니다.");
    }
}
