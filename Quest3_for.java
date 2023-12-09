package javastart;

// 반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성하세요.
// num이라는 변수를 사용해서 수를 표현해야 합니다.
// for문, while문 둘 다 만드세요.

public class Quest3_for {
    public static void main(String[] args) {
        int num = 2;

        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }
    }
}

