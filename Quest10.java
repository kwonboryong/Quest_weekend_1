package Quest;


import java.util.Scanner;

public class Quest10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;  // 누적 합계 선언

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            if (option == 1) {
                scanner.nextLine(); // ***

                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                totalCost += price * quantity;
                // 누적 해야 해서 += 사용! (totalCost = totalCost + price * quantity)

                System.out.println("상품명:" + product + " 가격:" + price + " 수량:" + quantity + " 합계:" + price * quantity);
                // totalCost는 누적 값이라 합계에 사용하지 않는다!

            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0; // 초기화 해주기

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }

    }

}
