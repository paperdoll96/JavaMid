package nested.ex;

public class AnonymousMain {

    public static void main(String[] args) {

        // 익명 클래스를 생성하고 Hello 인터페이스를 구현
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Anonymous Hello~~");
            }
        };

        hello.hello();
    }
}
