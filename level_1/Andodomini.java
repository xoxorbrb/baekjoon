package level_1;

import java.util.Scanner;

public class Andodomini {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = 0;

        System.out.println("불기년도를 입력하여주세요. (1000년이상 3000년이하) ");
        year = scan.nextInt();
        scan.close();

        if (!(year >= 1000 && year <= 3000))
            System.out.println("잘못입력하였습니다.");

        System.out.println(year + " 년의 서기년도는 " + (year - 543) + "년 입니다.");
    }
}
