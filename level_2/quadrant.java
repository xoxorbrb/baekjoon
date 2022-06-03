package level_2;

import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x, y = 0;
        x = scan.nextInt();
        y = scan.nextInt();

        scan.close();

        if ((x >= -1000 && x <= 1000 && !(x == 0)) && (y >= -1000 && y <= 1000 && !(y == 0))) {
            if (x > 0 && y > 0)
                System.out.println("1");
            else if (x < 0 && y > 0)
                System.out.println("2");
            else if (x < 0 && y < 0)
                System.out.println("3");
            else if (x > 0 && y < 0)
                System.out.println("4");
        }
    }
}
