package nested.nested;

/*
    정적 중첩 클래스

 */
public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {  // 정적 중첩 클래스 앞에 static이 붙는다
        private int nestedInstanceValue = 1;
        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
            //System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            System.out.println(NestedOuter.outClassValue); // NestedOuter 생략 가능.
        }
    }

}
