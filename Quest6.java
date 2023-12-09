package Quest;

// 사용자로부터 두 개의 정수를 입력 받고, 이 두 정수 사이의 모든 정수를 출력하는 프로그램

import java.util.Scanner;

public class Quest6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("두 숫자 사이의 모든 정수: ");

        for (int i = num1; i <= num2; i++) { // for문을 이용하여 num1부터 num2까지 출력!
            System.out.print(i);
            if (i != num2) { // i가 마지막 값이 아닐때만 ,쉼표 출력
                System.out.print(",");
            }
        }
    }

}
// num1과 num2 사이의 값들을 어떻게 출력하지?