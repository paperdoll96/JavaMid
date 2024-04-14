package nested.local;

/*
    내부 클래스를 포함한 중첩클래스들도 일반 클래스처럼 인터페이스를 구현하거나 부모클래스 상속 가능
 */
public class LocalOuterV2 {

    private int outInstanceVar = 3;


    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer{ // 지역 클래스는 지역 변수 처럼 접근 제어자를 사용 할 수 없음!!!!!!!!!
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value); // 자신의 인스턴스 변수인 value에 접근
                System.out.println("localVar=" + localVar); // 자신이 속한 코드 블럭의 지역 변수인 localVar에 접근
                System.out.println("paramVar=" + paramVar);  // 자신이 속한 코드 블럭의 매개변수인 paramVar에 접근. 참고로 매개변수도 지역 변수의 한 종류
                System.out.println("outInstanceVar=" + outInstanceVar); // 바깥 클래스의 인스턴스 멤버인 outInstanceVar에 접근
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }
    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
