package Quest;

// 사용자로부터 상품의 가격과 수량을 입력 받고, 총 비용을 출력하는 프로그램
// 가격과 수량을 입력받은 후에는 이들의 곱을 출력 (출력형태: "총 비용: [곱한 결과]")
// -1을 입력하면 가격 입력 종료

import java.util.Scanner;

public class Quest8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            int price = scanner.nextInt();

            if (price == -1) { // 순서 배치 중요!
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요: ");
            int quantity = scanner.nextInt();

            int total = price * quantity;
            System.out.println("총 비용: " + total);
        }
    }

}
