package Quest;

// 구구단 출력
// 사용자로부터 하나의 정수 n을 입력받고, 입력 받은 정수 n의 구구단을 출력하는 프로그램

import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int number = scanner.nextInt();

        System.out.println(number + "단의 구구단: ");

        for (int i = number; i <= number; i++) {
            for (int j = 1; j <= 9; j++) {

                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

    }
}
