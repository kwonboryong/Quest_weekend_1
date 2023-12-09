package Quest;

// 사용자로부터 음식의 이름, 가격, 수량을 입력받아, 주문한 음식의 총 가격을 계산하고 출력하는 프로그램
// 음식의 총 가격 계산: 각 음식의 가격 * 수량, 이 값을 totalPrice라는 이름의 변수에 저장하세요.
// 주문 정보와 총 가격 출력: "[음식 이름][수량]개를 주문하셨습니다. 총 가격은 [총 가격]원입니다."


import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = scanner.nextLine();

        System.out.print("음식의 가격을 입력해주세요: ");
        int foodPrice = scanner.nextInt();

        System.out.print("음식의 수량을 입력해주세요: ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원 입니다.");

    }
}
