package nested.anonymous.ex1;

import java.util.Random;

/*
    람다(lamda) 간단하게 써보기
    자바8에 들어서면서 큰 변화가 있었는데 바로 메서드(더 정확히는 함수)를 인수로 전달할 수 있게 되었는데, 이것을 간단히 람다(Lambda)라 한다
 */

public class Ex1MainRef5 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        //코드 조각 시작
        process.run();
        //코드 조각 종료
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {
        hello(() -> {       // 코드를 보면 클래스나 인스턴스를 정의 하지 않고, 메서드의 코드 블럭을 직접 전달하고 있따!
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });
        hello(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}

