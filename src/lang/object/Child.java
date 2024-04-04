package lang.object;

public class Child extends Parent{ // 만약 상속받을 부모 클래스를 명시적으로 지정하면 Object를 상속 받지 않음!
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
