package section01.jihye;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        /* Q) 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울을 출력하시오. 다른 숫자 입력 시에 경고문 작성하시오. */

        Scanner sc = new Scanner(System.in);

        System.out.printf("계절을 출력할 월을 입력하세요: ");
        int monthInput = sc.nextInt();
        sc.nextLine();

        if (monthInput < 1 || monthInput > 12){
            System.out.println("잘못된 값을 입력하였습니다.");
        } else {
            System.out.println("입력하신 월은 " + monthInput +"월");
            if(monthInput >= 3 && monthInput <= 5) {
                System.out.println("계절은 봄 입니다.");
            } else if (monthInput >= 6 && monthInput <= 8){
                System.out.println("계절은 여름 입니다.");
            } else if (monthInput >= 9 && monthInput <= 11) {
                System.out.println("계절은 가을 입니다.");
            } else {
                System.out.println("계절은 겨울 입니다.");
            }
        }
    }
}
