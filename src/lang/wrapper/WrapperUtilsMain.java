package lang.wrapper;

/*
    래퍼 - 주요메서드
 */
public class WrapperUtilsMain {
    public static void main(String[] args) {

        Integer i1 = Integer.valueOf(10); // 숫자, 래퍼 객체 반환
        Integer i2 = Integer.valueOf("10"); // 문자열, 래퍼 객체 반환
        int intValue = Integer.parseInt("10"); // 문자열 전용, 기본형 반환 '문자열을 기본형으로'

        // 비교
        int compareResult = i1.compareTo(20); //  내 값과 인수로 넘어온 값을 비교한다. 내 값이 크면 1 , 같으면 0 , 내 값이 작으면 -1 을 반환한다.
        System.out.println("compareResult = " + compareResult);

        // 산술연산
        System.out.println("sum: " + Integer.sum(10, 20)); // 덧셈
        System.out.println("min: " + Integer.min(10, 20)); // 작은 값
        System.out.println("max: " + Integer.max(10, 20)); // 큰 값

    }
}
