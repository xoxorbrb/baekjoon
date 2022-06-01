package level_1;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = "";
        System.out.println("출력할 문장을 입력하여주세요.");
        input = scan.nextLine();

        scan.close();
        System.out.println("입력한 문장은 " + input + "입니다.");
    }
}
