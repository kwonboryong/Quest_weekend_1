package javastart;

// 반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성하세요.
// num이라는 변수를 사용해서 수를 표현해야 합니다.
// for문, while문 둘 다 만드세요.

public class Quest3_while {
    public static void main(String[] args) {
        int num = 2;
        int count = 1; // (횟수)

        while (count <= 10) { // 10번으로 횟수 제한
            System.out.println(num);
            num += 2; // num에 2를 더해줌 => 짝수 만들기
            count++;
        }
    }
}
