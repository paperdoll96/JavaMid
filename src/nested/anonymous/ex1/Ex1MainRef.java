package nested.anonymous.ex1;

import java.util.Random;

public class Ex1MainRef {
    public static void hello(Process process) { // Process process 매개변수를 통해 인스턴스를 전달
        System.out.println("프로그램 시작");
        process.run();  // 이때 다형성을 활용해서 외부에서 전달되는 인스턴스에 따라 각각 다른 코드 조각이 실행된다
        System.out.println("프로그램 종료");
    }
    static class Dice implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements  Process {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }
    public static void main(String[] args) {
        Dice dice = new Dice();
        Sum sum = new Sum();

        hello(dice); // hello() 를 호출할 때 어떤 인스턴스를 전달하는 가에 따라서 다른 결과가 실행된다.
        hello(sum);
    }

    /*
        문자열 같은 데이터를 메서드에 전달할 떄는 String, int 와 같은 각 데이터에 맞는 타입을 전달
        코드 조각을 메서드에 전달할 때는 인스턴스를 전달하고, 해당 인스턴스에 있는 메서드를 호출
     */
}
