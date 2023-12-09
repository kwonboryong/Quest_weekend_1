package Quest;

// 사용자로부터 이름과 나이를 반복해서 입력받고, 입력 받은 이름과 나이를 출력하시오
// 사용자가 '종료'를 입력하면 프로그램이 종료됩니다.

import java.util.Scanner;

public class Quest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt(); // nextInt는 숫자만 가져가고 엔터(/n)는 안가져가서 오류가 발생(에러는 아님)
            scanner.nextLine(); // 그냥 라인을 한 번 읽고 버려주기

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }

    }

}
