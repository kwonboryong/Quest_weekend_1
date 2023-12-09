package Quest;

// 사용자로부터 여러 개의 숫자를 입력 받고, 그 숫자들의 합계(sum)와 평균(average)을 계산하는 프로그램
// 사용자는 숫자를 입력하고, 마지막에는 -1을 입력하여 숫자 입력을 종료
// 모든 숫자의 입력이 끝난 후에는, 숫자들의 합계 sum과 평균 average를 출력
// 평균(average)은 소수점 아래까지 계산 => double!

import java.util.Scanner;

public class Quest9 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int sum = 0; // 합계
        int count = 0; // 입력값의 평균을 구하기 위한 입력값의 갯수
        int input = 0; // 입력값

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: "); // while문 전에 넣어야 계속 입력할 수 있음

        while (true) {
            input = number.nextInt();
            if (input == -1) { // 중단하려면 -1
                break;
            }
            sum += input; // 숫자의 누적 합계
            count++; // 입력값의 평균 구하기 위한 입력값의 갯수
        }

        // while문 축약 가능
        /*while ((input = scanner.nextInt()) != -1) { // 입력값이 -1이 아닐땐 true라서 실행, -1이면 false라서 탈출
            sum += input;
            count++;
        }*/

        double average = (double) sum / count; // 평균: 합계 / 갯수

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);

    }

}
