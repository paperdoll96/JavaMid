package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
     LocalDateTime: LocalDate 와 LocalTime 을 합한 개념
 */
public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(1996, 0, 8, 11, 0, 15);
        // 와 여기 시간은 0이 들어가지만 날짜에 0 들어가면 어떻게 되지? 해서 넣어봤더니 DateTimeException터지는구나..

        System.out.println("현재 날짜시간 = " + nowDt);
        System.out.println("지정 날짜시간 = " + ofDt);

        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();  // toXxx() 메서드로 날짜와 시간 분리 가능
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime); // LocalDateTime.of 로 합치기 가능
        System.out.println("localDateTime = " + localDateTime);

        //계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);  // 계산도 똑같이 plusXxx() 로 더하기 가능 이 또한 여러 메서드 존재!
        System.out.println("지정 날짜시간+1000d = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("지정 날짜시간+1년 = " + ofDtPlus1Year);

        //비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt));  // 다른 날짜시간과 비교. 시간이 다른 날짜보다 이전이라면 true
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDt.isAfter(ofDt)); // 다른 날짜시간과 비교. 시간이 다른 날짜보다 이후라면 true
        System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? " + nowDt.isEqual(ofDt)); // 다른 날짜와 시간적으로 동일한지 비교. 같으면 true

        /*
            isEquals() vs equals()
            - isEquals() 는 단순히 비교 대상이 '시간'적으로 같으면 true를 반환 객체가 달라도 시간만으로 둘을 비교
            - equals() 는 객체 타입, 타임존 등 내부 데이터의 모든 구성 요소가 같아야 true를 반환!

         */
    }

}
