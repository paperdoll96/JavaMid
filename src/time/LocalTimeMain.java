package time;
/*
    LocalTime: 시간만을 표현할 때 사용한다. 시, 분, 초를 다룬다.
 */
import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {

        LocalTime nowTime = LocalTime.now();  // 현재 시간을 기준으로 생성
        LocalTime ofTime = LocalTime.of(12, 23, 38); // 특정 (지정) 시간을 기준으로 생성 시,분,초,나노초 입력가능

        System.out.println("현재 시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);

        // 계산(불변)
        LocalTime ofTimePlus = ofTime.plusSeconds(30); // 특정 초 더하기.  날짜와 마찬가지로 다양한 기능 존재

        System.out.println("지정 시간+30s = " + ofTimePlus);
    }
}
