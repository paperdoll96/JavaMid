package enumeration.test;

/*
     인증등급 조회해보기
 */
public class AuthGradeMain1 {
    public static void main(String[] args) {

        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("grade=" + value.name() + ", level=" + value.getLevel() + ", 설명=" + value.getDescription());
        }


    }
}
