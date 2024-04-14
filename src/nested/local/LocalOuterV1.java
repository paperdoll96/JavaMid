package nested.local;

/*
    지역 클래스
    지역클래스는 내부 클래스의 특별한 종류의 하나이다! 따라서 내부 클래스의 특징을 그대로 가진다
    지역 클래스는 지역 변수와 같이 코드 블럭 안에서 정의!
 */
public class LocalOuterV1 {

    private int outInstanceVar = 3;


    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter { // 지역 클래스는 지역 변수 처럼 접근 제어자를 사용 할 수 없음!!!!!!!!!
            int value = 0;

            public void printData() {
                System.out.println("value=" + value); // 자신의 인스턴스 변수인 value에 접근
                System.out.println("localVar=" + localVar); // 자신이 속한 코드 블럭의 지역 변수인 localVar에 접근
                System.out.println("paramVar=" + paramVar);  // 자신이 속한 코드 블럭의 매개변수인 paramVar에 접근. 참고로 매개변수도 지역 변수의 한 종류
                System.out.println("outInstanceVar=" + outInstanceVar); // 바깥 클래스의 인스턴스 멤버인 outInstanceVar에 접근
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }
    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
