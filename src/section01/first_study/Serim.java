package section01.first_study;

import java.util.Random;
import java.util.Scanner;

public class Serim {
    public static void main(String[] args) {

        /* Q 1) 사용자 입력과 random 메소드를 사용하여, 사용자(User)와 컴퓨터가 대결하는 가위 바위 보 게임을 만들어보자.
              입력: [문자열] "가위", "바위" 혹은 "보" 출력: [문자열] 결과 반환
         */

        /* 설명) 사용자에게 가위, 바위, 보 중 하나를 입력 받는 코드 */
        Scanner sc = new Scanner(System.in);

        System.out.print("가위, 바위, 보 중 하나를 입력하시오: ");
        String userInput = sc.next();       // 사용자 입력을 저장할 변수
        sc.nextLine();                      // 버퍼에 저장된 개행 및 공백 제거
//        System.out.println("userInput = " + userInput);     // 입력 확인용 코드


        /* 설명) 컴퓨터가 랜덤으로 가위, 바위, 보를 반환하는 코드 */
        Random random = new Random();
        int randomNumber = random.nextInt(3);                   // 0~2까지 정수형 난수 생성
//        System.out.println("randomNumber = " + randomNumber);          // 난수 확인용 코드

        String computerChoice = "";                  // 컴퓨터의 가위, 바위, 보를 저장할 변수
        switch (randomNumber){                       // 0 = 가위, 1 = 바위, 2 = 보
            case 0:
                computerChoice = "가위";
                break;
            case 1:
                computerChoice = "바위";
                break;
            case 2:
                computerChoice = "보";
                break;
        }
//        System.out.println("computerChoice = " + computerChoice);       // 문자열로 잘 변환되는지 확인

        /* 설명) 컴퓨터와 사용자의 가위바위보 결과를 반환하는 코드 */
        public static String printResult
        /* 가위바위보 1:1 대결 시 나올 수 있는 경우의 수는 총 9가지
          1) 가위 vs 가위
          2) 가위 vs 바위
          3) 가위 vs 보
          4) 바위 vs 가위
          5) 바위 vs 바위
          6) 바위 vs 보
          7) 보 vs 가위
          8) 보 vs 바위
          9) 보 vs 보 */

        if(!(userInput.equals("가위") || userInput.equals("바위") || userInput.equals("보"))) {      // 사용자 입력에 대한 예외 처리(가위, 바위, 보 외의 문자 입력 시)
            System.out.printf("잘못된 값이 입력되었습니다.\n프로그램을 종료합니다.");
        } else {
            int userNumber = 0;             // if문에서 숫자로 편하게 조건식을 만들고자 추가한 코드
            switch (userInput) {
                case "가위":
                    userNumber = 0;
                    break;
                case "바위":
                    userNumber = 1;
                    break;
                case "보":
                    userNumber = 2;
                    break;
            }
//        System.out.println("userNumber = " + userNumber);      // 값이 올바르게 매칭되었는지 확인

            System.out.println("사용자: " + userInput + ", 컴퓨터: " + computerChoice);       // 사용자와 컴퓨터의 가위바위보 선택값 출력
            System.out.println();

            /* 가위 = 0 , 바위 = 1, 보 = 2 */
            if (userNumber == randomNumber) {                         // if-else문을 사용하여 비겼을 때와 아닐 때로 나누었음.
                System.out.printf("비겼습니다.");
            } else {
                if (userNumber == 0) {                                // 사용자가 가위를 낸 경우
                    if (randomNumber == 1) {                         // 가위 vs 바위
                        System.out.println("컴퓨터가 이겼습니다!");
                    } else {                                        // 가위 vs 보
                        System.out.println("사용자가 이겼습니다!");
                    }
                }
                if (userNumber == 1) {                                // 사용자가 바위를 낸 경우
                    if (randomNumber == 0) {                         // 바위 vs 가위
                        System.out.println("사용자가 이겼습니다!");
                    } else {                                        // 바위 vs 보
                        System.out.println("컴퓨터가 이겼습니다!");
                    }
                }
                if (userNumber == 2) {                                // 사용자가 보를 낸 경우
                    if (randomNumber == 0) {                         // 보 vs 가위
                        System.out.println("컴퓨터가 이겼습니다!");
                    } else {                                        // 보 vs 바위
                        System.out.println("사용자가 이겼습니다!");
                    }
                }
            }
        }
    }
}
