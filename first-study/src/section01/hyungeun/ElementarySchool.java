package section01.hyungeun;

import java.util.Scanner;

public class ElementarySchool {
    public static void main(String[] args) {
        /* Q) 1. 한 초등학교에는 1학년부터 6학년까지 한 해의 마지막 날 시험을 보는데
            6학년은 80점 이상, 4학년부터 5학년까지는 70점 이상, 1학년부터 3학년까지는 60점 이상의 점수를 받아야 다음 학년으로 올라갈 수 있다.
            사용자들로부터 이름, 점수, 학년을 받아 아래와 같은 결과물이 출력되도록 작성하시오.
            (입력 받는 값은 학년은 1~6까지, 점수는 0~100 까지만 받을 수 있고 그 이외의 숫자를 받게 되면 “다시 입력하세요”를 출력  )
             → 학년별 점수 충족시 : “OOO 학생은 다음 학년으로 갑니다”
             → 학년별 점수 미달시 : “OOO 학생은 내년에 더 노력하세요”*/

        Scanner sc = new Scanner(System.in);

        while (true) {                                      // 예외 처리를 위해 while문 사용

            System.out.print("학생의 이름을 입력하세요 (종료하려면 '종료'입력): ");
            String name = sc.nextLine();

            if(name.equals("종료"))
                break;

            System.out.print("학년을 입력하세요 (1~6): ");
            int grade = sc.nextInt();
            if (grade < 1 || grade > 6) {
                System.out.println("다시 입력하세요");
                sc.nextLine(); // 버퍼 비우기
                continue;
            }

            System.out.print("점수를 입력하세요 (0~100): ");
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("다시 입력하세요");
                sc.nextLine(); // 버퍼 비우기
                continue;
            }

            sc.nextLine(); // 버퍼 비우기

            if ((grade == 6 && score >= 80) || ((grade < 6 && grade >= 4) && score >= 70) || (grade <= 3 && score >= 60)) {
                System.out.println(name + " 학생은 다음 학년으로 갑니다");
            } else {
                System.out.println(name + " 학생은 내년에 더 노력하세요");
            }
        }
    }
}