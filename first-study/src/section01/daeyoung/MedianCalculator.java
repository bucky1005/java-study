package section01.daeyoung;

import java.util.Scanner;

public class MedianCalculator {
    public static void main(String[] args) {

        /* Q) 사용자로 부터 세 개의 수를 입력 받은 후, 입력 받은 수 중 중앙값을 출력 하시오. */

        /* 설명) 사용자에게 세 개의 수를 입력 받는 코드  => 메소드로 생성 */
        Scanner sc = new Scanner(System.in);

        System.out.printf("첫번째 값 입력: ");
        int inputNumber1 = sc.nextInt();

        System.out.printf("두번째 값 입력: ");
        int inputNumber2 = sc.nextInt();

        System.out.printf("세번째 값 입력: ");
        int inputNumber3 = sc.nextInt();

        /* 설명) 중앙값 비교 */
        int maxNumber = inputNumber1;
        int medianNumber = 0;

        if (maxNumber >= inputNumber2) {                     // 첫번째 수와 두번째 수 대소 비교
            if (maxNumber >= inputNumber3) {                 // 1 >= 2인 경우, 첫번째 수와 세번째 수 대소 비교
                if (inputNumber2 >= inputNumber3) {          // 위 두 조건이 모두 참인 경우, 1이 maxNumber 확정, 2와 3 대소 비교
                    medianNumber = inputNumber2;             // 1 > 2 >= 3인 경우, 2를 중간값으로 대입
                } else {
                    medianNumber = inputNumber3;             // 1 > 3 > 2인 경우, 3을 중간값으로 대입
                }
            }
        } else {
            if (inputNumber2 >= inputNumber3) {               // 1 < 2 인 경우, 2와 3의 대소 비교
                maxNumber = inputNumber2;                     // 2 > 1 && 2 > 3 이므로 2가 maxNumber 확정
                if (inputNumber1 >= inputNumber3) {           // 1과 3 대소 비교
                    medianNumber = inputNumber1;              // 2 > 1 >= 3이므로 1을 중간값으로 대입
                } else {
                    medianNumber = inputNumber3;        // 2 >= 3 > 1인 경우, 3을 중간값으로 대입
                }
            } else {
                maxNumber = inputNumber3;               // 3이 maxNumber로 확정
                if (inputNumber1 >= inputNumber2) {
                    medianNumber = inputNumber1;        // 3 > 1 >= 2인 경우, 1을 중간값으로 대입
                } else {
                    medianNumber = inputNumber2;        // 3 > 2 > 1인 경우, 2를 중간값으로 대입
                }
            }
        }

        System.out.println("입력 받은 수 중 중간값은 = " + medianNumber + " 입니다.");

    }


}
