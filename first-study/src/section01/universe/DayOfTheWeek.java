package section01.universe;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        /* Q) 날짜를 입력받아 1일이면 ‘월’ / 2일이면 ‘화’ / 3일이면 ‘수’ / … / 7일이면 ‘일’ / 8일이면 ‘월’ / …..
            위 방식으로 요일을 출력하시오.
            조건: 1일이 월요일인 것으로 고정 */

        Scanner sc = new Scanner(System.in);

        System.out.printf("날짜를 입력하시오: ");
        int inputDate = sc.nextInt();
        sc.nextLine();

        int dayOfTheWeek = inputDate % 7;
        if(inputDate < 1 || inputDate > 31){
            System.out.println("잘못된 날짜를 입력하였습니다.");
        } else {
            switch (dayOfTheWeek){
                case 0:
                    System.out.println("일요일");
                    break;
                case 1:
                    System.out.println("월요일");
                    break;
                case 2:
                    System.out.println("화요일");
                    break;
                case 3:
                    System.out.println("수요일");
                    break;
                case 4:
                    System.out.println("목요일");
                    break;
                case 5:
                    System.out.println("금요일");
                    break;
                case 6:
                    System.out.println("토요일");
                    break;
            }
        }
    }
}
