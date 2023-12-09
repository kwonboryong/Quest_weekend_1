package Quest;

// 변수값 교환하기
// 변수 a=10이 들어있고, b=20이 들어있다. 변수 a의 값과 b의 값을 서로 바꾸어라

public class Quest5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a; // 10
        a = b; // 20
        b = temp; // 20

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
