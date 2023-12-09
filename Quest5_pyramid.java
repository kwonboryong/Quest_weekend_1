package javastart;

// 별(*)로 피라미드 출력하기
// int row를 선언하고 그 수만큼 피라미드 출력하기 (int row = 2, 5)

public class Quest5_pyramid {
    public static void main(String[] args) {
        int row = 7; // 행 (가로)

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) { // * (j <= i) -> 매우 중요ㅠㅠ
                System.out.print("*");
            }
            System.out.println(); // * 한 줄마다 줄바꿈 해주기!
        }

    }
}
