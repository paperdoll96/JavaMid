package nested.anonymous;

/*
    익명 클래스(anonymous class)는 지역 클래스의 특별한 종류의 하나이고 클래스의 이름이 없다는 특징이 있따!
 */
import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;
        Printer printer = new Printer() { // 지역 클래스의 선언과 생성을 한번에
            int value = 0;
            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class=" + printer.getClass());
    }
    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
    /*
        익명클래스 특징
        1. 익명클래스는 이름 없는 지역 클래스를 선언하면서 동시에 생성
        2. 익명 클래스는 부모 클래스를 상속 받거나, 인터페이스를 구현 해야 함. 즉, 익명 클래스를 사용할 떄는 상위 클래스나 인터페이스가 필요!
        3. 익명 클래스는 말 그대로 이름X. 이름을 가지지 않으므로, 생성자도 가질 수 없다!

        장점
        익명클래스를 사용하면 클래스를 별도로 정의하지 않고도 인터페이스나 추상 클래스를 즉석에서 구현할 수 있어 코드가 간결해진다.
        하지만, 복잡하거나 재사용이 필요한 경우 별도의 클래스를 정의하는 것이 좋음!
     */

}
