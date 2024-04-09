package enumeration.test;

import java.util.Scanner;

/*
   인증등급 활용하기
 */
public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 등급을 입력 하세용 ! [GUEST, LOGIN, ADMIN]  : " );
        String grade = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase()); // toUpperCase() 를 사용하면 소문자를 써도 대문자로 변형해줌
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다");

        System.out.println("==메뉴==");
        if(authGrade.getLevel() > 0 ) {
            System.out.println("- 메인화면");
        }
        if(authGrade.getLevel() > 1 ) {
            System.out.println("- 다른메뉴");
        }
        if(authGrade.getLevel() > 2 ) {
            System.out.println("- 다른메뉴메뉴");
        }


    }
}
