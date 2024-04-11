package nested.inner;

/*
    내부 클래스
    정적중첩은 바깥 클래스와 서로 관계가 없다! 하지만 내부 클래스는 바깥 클래스의 인스턴스를 이루는 요소가 됨!
    내부클래스는 바깥 클래스의 인스턴스에 소속된다는 소리!
 */
public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner { // 내부 클래스는 앞에 static 이 붙지 않는다. 쉽게 이야기해서 인스턴스 멤버가 된다!
        private int innerInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(innerInstanceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outInstanceValue);

            // 외부 클래스의 클래스 멤버에는 접근 가능. private도 접근 가능
            System.out.println(InnerOuter.outClassValue);
        }

    }

}
