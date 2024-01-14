package section01.serim;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    /* 설명) 자주 사용할 변수를 상수로 선언 */
    static final String SCISSORS = "가위";
    static final String ROCK = "바위";
    static final String PAPER = "보";

    public static void main(String[] args) {

        /* Q 1) 사용자 입력과 random 메소드를 사용하여, 사용자(User)와 컴퓨터가 대결하는 가위 바위 보 게임을 만들어보자.
              입력: [문자열] "가위", "바위" 혹은 "보" 출력: [문자열] 결과 반환
         */

        /* 설명) 사용자에게 가위, 바위, 보 중 하나를 입력 받는 코드 */
        Scanner sc = new Scanner(System.in);

        System.out.print("가위, 바위, 보 중 하나를 입력하시오: ");
        String userInput = sc.next().trim();                  // 사용자 입력을 저장할 변수
//        System.out.println("userInput = " + userInput);     // 입력 확인용 코드

        /* 설명) 사용자 입력에 대한 예외 처리(잘못된 값을 입력할 경우) */
        if (!(userInput.equals(SCISSORS) || userInput.equals(ROCK) || userInput.equals(PAPER))) {      // 사용자 입력에 대한 예외 처리(가위, 바위, 보 외의 문자 입력 시)
            System.out.printf("잘못된 값이 입력되었습니다.\n프로그램을 종료합니다.");
            return;
        }

//        System.out.println("userNumber = " + userNumber);      // 값이 올바르게 매칭되었는지 확인

        /* 설명) 컴퓨터가 랜덤으로 가위, 바위, 보를 반환하는 코드 */
        Random random = new Random();
        int randomNumber = random.nextInt(3);                   // 0~2까지 정수형 난수 생성
//        System.out.println("randomNumber = " + randomNumber);          // 난수 확인용 코드

        String computerChoice = "";                  // 컴퓨터의 가위, 바위, 보를 저장할 변수
        switch (randomNumber) {                       // 0 = 가위, 1 = 바위, 2 = 보
            case 0:
                computerChoice = SCISSORS;
                break;
            case 1:
                computerChoice = ROCK;
                break;
            case 2:
                computerChoice = PAPER;
                break;
        }
//        System.out.println("computerChoice = " + computerChoice);       // 문자열로 잘 변환되는지 확인

        /* 설명) 가위바위보 결과 출력 */
        System.out.println("사용자: " + userInput + ", 컴퓨터: " + computerChoice);       // 사용자와 컴퓨터의 가위바위보 선택값 출력
        System.out.println();

        printResult(userInput, computerChoice);             // 결과를 출력하는 메소드 호출

    }

    /* 설명) 컴퓨터와 사용자의 가위바위보 결과를 반환하는 메소드 */
    /* 1:1로 가위바위보 대결을 하였을 때 나올 수 있는 경우의 수는 총 9가지
    * 사용자 vs 컴퓨터
    * 1) 비겼을 경우
    *    가위 vs 가위 / 바위 vs 바위 / 보 vs 보
    * 2) 사용자가 이겼을 경우
    *    가위 vs 보 / 바위 vs 가위 / 보 vs 바위
    * 3) 컴퓨터가 이겼을 경우
    *    가위 vs 바위 / 바위 vs 보 / 보 vs 가위 */
    public static void printResult(String userChoice, String computerChoice) {

        // userChoice == computerChoice
        if (userChoice.equals(computerChoice)) {                                      // 비겼을 경우
            System.out.println("비겼습니다.");
        } else if (userChoice.equals(SCISSORS) && computerChoice.equals(PAPER) ||
                userChoice.equals(ROCK) && computerChoice.equals(SCISSORS) ||
                userChoice.equals(PAPER) && computerChoice.equals(ROCK)) {          // 사용자가 이겼을 경우
            System.out.println("사용자가 이겼습니다!");
        } else {                                                                    // 컴퓨터가 이겼을 경우
            System.out.println("컴퓨터가 이겼습니다!");
        }
    }
}
