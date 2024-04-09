package time;

/*
    LocalDate: 날짜만 표현할 때 사용한다. 년, 월, 일을 다룬다. 예) 2013-11-21
 */
import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();        // now() 현재 시간을 기준으로 생성
        LocalDate ofDate = LocalDate.of(1996, 2, 8); // of(...) 특정 날짜를 기준으로 생성. 지정
        System.out.println("오늘 날짜 = " + nowDate );
        System.out.println("지정 날짜 = " + ofDate );

        // 계산 (불변이라서 반드시 반환값을 받아야댐!)
        LocalDate plusDays = ofDate.plusDays(10);   // plusDays() 특정일을 더함
        LocalDate week = ofDate.plusWeeks(1);    // week month year 등 이 있음!

        System.out.println("지정 날짜 + 10일 = " + plusDays);
        System.out.println("지정 날짜 + 1주 = " + week);
    }
}
