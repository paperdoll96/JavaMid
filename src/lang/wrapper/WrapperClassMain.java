package lang.wrapper;
/*
    래퍼 클래스
    쉽게 말하면 래퍼 클래스는 기본형의 객체 버전이다!
    int -> Integer
    double -> Double 등등 필요하면 구글링 해보자!

    그리고 불변 특징과 객체인만큼 equals로 비교 해야함!
 */
public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //미래에 삭제 예정, 대신에 valueOf() 사용
        Integer integerObj = Integer.valueOf(10); //-128 ~ 127 자주 사용하는 숫자 값 재사용, 불변 저번에 배웠던 문자열 풀 생각하면 될듯! 이 범위의 값이 없으면 new Integer()호출
                                                    // 내부에서 new Integer(10) 을 사용해서 객체를 생성하고 돌려줌
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();   // intValue() 래퍼 클래스에 들어있는 기본형 값을 다시 꺼내는 메서드
                                                // 박스에 들어있는 물건을 꺼내는거 같다고 해서 언박싱 이라 함!
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longObj = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + newInteger.equals(integerObj));

            /*
                *참고 래퍼클래스는 객체를 그대로 출력해도 내부에 있는 값이 문자로 출력되도록 toString()을 재정의 함 !
             */
    }
}
