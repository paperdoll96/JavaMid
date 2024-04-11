package nested.inner;

/*
    내부 클래스는 바깥 클래스의 인스턴스에 소속된다. 따라서 바깥 클래스의 인스턴스 정보를 알아야 생성할 수 있다.

 */
public class InnerOuterMain {
    public static void main(String[] args) {

        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // 내부 클래스는 new 바깥클래스의 인스턴스 참조.내부클래스() 로 생성
                                                    // outer.new Inner() 에서 outer 는 바깥 클래스의 인스턴스 참조를 가진다
                                                    // outer.new Inner() 로 생성한 내부 클래스는 개념상 바깥 클래스의 인스턴스 내부에 생성된다.
                                                    // 따라서 바깥 클래스의 인스턴스를 먼저 생성해야 내부 클래스의 인스턴스를 생성할 수 있다!
        inner.print();
    }

    /*
        정리
          중첩(Nested): 어떤 다른 것이 내부에 위치하거나 포함되는 구조적인 관계
          내부(Inner): 나의 내부에 있는 나를 구성하는 요소

          정적 중첩 클래스는 다른 클래스를 그냥 중첩해 둔 것일 뿐이다. 쉽게 이야기해서 둘은 아무런 관계가 없다.
          반면에 내부클래스는 바깥 클래스의 인스턴스 내부에서 구성 요소로 사용된다!
     */
}
