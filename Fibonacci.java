import java.util.Scanner;

public class Fibonacci {

    static int count0 = 0;
    static int count1 = 0;

    public static int fibonacci(int n) {

        if (n == 0) {
            count0 += 1;
            return 0;
        } else if (n == 1) {
            count1 += 1;
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int T = 0; // 테스트 수
        System.out.println("몇 번의 테스트를 할까요? (숫자입력)");
        T = scan.nextInt();
        for(int i = 0; i < T; i++) {
            System.out.println("숫자를 입력하세요");
            n = scan.nextInt();

            fibonacci(n);

            System.out.println("0의 개수: " + count0 + " 1의 개수: " + count1);

            count0 = 0;
            count1 = 0;
        }
    scan.close();
}
}
