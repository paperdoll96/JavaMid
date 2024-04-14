package nested.ex;

public class OuterClass2Main {
    public static void main(String[] args) {

        // OuterClass2의 인스턴스 생성
        OuterClass2 outer = new OuterClass2();

        // OuterClass2의 인스턴스를 통해 InnerClass의 인스턴스 생성
        // 이때, InnerClass는 OuterClass2의 내부 클래스이므로, OuterClass2의 인스턴스를 통해 접근
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();

    }
}
