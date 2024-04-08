package lang.wrapper;

/*
    기본형과 래퍼형의 성능 차이 비교
 */
public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복횟수
        long startTime, endTime;

        // 기본형 long
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i=0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");
        /* 결과 280ms */


        // 래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; // 오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - startTime) + "ms");
        /* 결과 5166ms */

        /*
            기본형은 메모리에서 단순히 그 크기만큼의 공간을 차지한다. 예를 들어 int 는 보통 4바이트의 메모리를 사용한다.
            래퍼 클래스의 인스턴스는 내부에 필드로 가지고 있는 기본형의 값 뿐만 아니라 자바에서 객체 자체를 다루는데 필요한 객체 메타데이터를 포함하므로 더 많은 메모리를 사용한다.

            그럼 무엇을 사용해야 하느냐?
            사실 내 컴퓨터 사양은 좋지 않기 때문에 10배 이상 차이 나긴 하는데 요즘 컴퓨터로 따지면
            일반적인 애플리케이션을 만드는 관점에서 보면 이런 부분을 최적화 해도 사막의 모래알 하나 정도의 차이 라고한다!
            CPU 연산을 아주 많이 수행하는 특수한 경우이거나, 수만~ 수십만 이상 연속해서 연산을 수행해야 하는 경우라면 기본형을 사용해서 최적화를 고려!
            그렇지 않은 일반적인 경우라면 코드를 유지보수하기 더 나은 것을 선택!
         */
    }
}
