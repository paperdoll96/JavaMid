package lang.ex;

/*
    오토 언박싱 사용해보기
 */
public class WrapperEx4 {
    public static void main(String[] args) {
        String str = "100";
        
        // 1. String str 을 Integer로 변환 하기
        Integer integer1 = Integer.valueOf(str);            // 타입이 다른ㅍ 경우는 오토 안됩니다!!!
        System.out.println("integer1 = " + integer1);

        // 2. Integer를 int 로 변환해서 출력하기
        int intValue = integer1;                            // 이렇게 간단하게 해주면 끝 !!!!!!!!!!!!!!
        System.out.println("intValue = " + intValue);

        // 3. int 를 Integer로 변환하기
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);


    }
}
