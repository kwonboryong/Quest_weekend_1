package javastart;

// 누적 합 계산
// 1부터 max까지의 합을 계산하고 출력하시오.
// sum이라는 변수를 사용하여 변수의 합 표현한다.
// i라는 변수를 사용하여 1부터 max까지 증가하는 변수를 수행해야 한다.

public class Quest4_While {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1; // 처음 값 (여기부터 시작)
        int max = 100; // 최종 값 (여기까지 증가)

        while (i <= max) { // i가 max가 될 때까지
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
