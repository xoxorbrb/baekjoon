package level_2;

import java.util.Scanner;

public class ovenalarm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, C, D, E = 0;
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        scan.close();

        if ((A >= 0 && A <= 23) && (B >= 0 && B <= 59) && (C >= 0 && C <= 1000)) {

            D = C / 60;
            E = C % 60;
            if (A + D > 23 && A + E > 23 && ) {
                A = 0;
                A = D - 1;
            } else {
                A = A + D;
            }
            if (B + E > 59) {
                A += 1;
                B = B + E - 60;
            } else {
                B = B + E;
            }
            System.out.println(A + " " + B);
        }
    }
}
