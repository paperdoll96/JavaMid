package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {

        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested(); // 정적 중첩 클래스는 new 바깥클래스.중첩클래스() 로 생성할 수 있다.
        nested.print();

        /*
            여기서 new NestedOuter() 로 만든 바깥 클래스의 인스턴스와 new NestedOuter.Nested() 로 만든 정적중첩클래스의 인스턴스는
            서로 아무 관계가 없는 인스터스이다. 참고로 아무런 관련이 없으면 정적 중첩 클래스의 인스턴스만 따로 생성해도 됌
         */
    }
}
