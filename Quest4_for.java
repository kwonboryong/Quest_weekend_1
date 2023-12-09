package javastart;

// 누적 합 계산
// 1부터 max까지의 합을 계산하고 출력하시오.
// sum이라는 변수를 사용하여 변수의 합 표현한다.
// i라는 변수를 사용하여 1부터 max까지 증가하는 변수를 수행해야 한다.

public class Quest4_for {
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;

        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
        }
    }

