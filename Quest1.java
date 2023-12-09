package Quest;

// 이름, 나이 입력 받고 출력하기
// 예시
// 당신의 이름을 입력하세요: 자바
// 당신의 나이를 입력하세요: 30
// 당신의 이름은 자바이고, 나이는 30살입니다.

import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요: ");
        String str = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 " + str + "이고, " + "나이는 " + age + "입니다.");

    }

}
