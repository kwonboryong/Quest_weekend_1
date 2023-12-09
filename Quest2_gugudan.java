package javastart;

// 중첩 for문을 사용해서 구구단을 완성하시오.
// 예시
//1 * 1 = 1
//1 * 2 = 2
//  ...
//9 * 9 = 81

public class Quest2_gugudan {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) { // 1단 ~ 9단
            for (int j = 1; j <= 9; j++) { // 1단의 1, 2, 3...
                System.out.println(i + " * " +j + " = " + i * j);
            }

        }

    }

}
// 구구단 결과는 잘 나왔으나 과정(1 * 1 = 1)을 출력하는 것을 못하겠음
// (1 * 1 = 1) => (i + "*" +j + "=" + i * j)