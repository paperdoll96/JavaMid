package lang.ex;

public class WrapperEx3 {
    public static void main(String[] args) {
        String str = "100";
        
        // 1. String str 을 Integer로 변환 하기
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        // 2. Integer를 int 로 변환해서 출력하기
        int intValue = integer1.intValue();
        System.out.println("intValue = " + intValue);

        // 3. int 를 Integer로 변환하기
        Integer integer2 = Integer.valueOf(str);
        System.out.println("integer2 = " + integer2);


    }
}
