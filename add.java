import java.util.Scanner;

public class add {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result = 0;

        System.out.println("숫자를 입력해주세요: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        sc.close();
        result = num1 + num2;

        System.out.println(result);
    }
}
