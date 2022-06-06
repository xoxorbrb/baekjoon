package level_2;

import java.util.Scanner;

public class alarm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H, M = 0;

        H = scan.nextInt();
        M = scan.nextInt();
        scan.close();

        if ((H <= 23 && H >= 0) && (M <= 59 && M >= 0)) {
            if (M - 45 >= 0) {
                M = M - 45;
            } else if (M - 45 < 0) {
                if (H == 0) {
                    H = 24;
                }
                H = H - 1;
                M = M + 15;
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println("잘못입력하였습니다.");
        }

    }
}
