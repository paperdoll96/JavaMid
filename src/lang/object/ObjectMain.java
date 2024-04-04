package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod(); // 자기 자신은 물론이고 부모 까지 호출 가능

        // toString()은 Object 클래스의 메서드 이 메서드는 객체의 정보를 제공
        String string = child.toString();
        System.out.println(string);
    }
    /*
        자바에서 Object 클래스가 최상위 부모클래스인 이유
        1. 공통 기능 제공
            기본 기능을 객체로 만들때마다 새로운 메서드를 정의해야 해서 번거롭고 개발자마다 다른 이름으로 해서 일관성이 없음
            그래서 기본적으로 편리한 기능을 제공하고 어디든지 상속 받을 수 있게 함
            대표적으로 제공하는 기능은
            위에 있는 toString() , 객체가 같음을 비교하는 equals(), 객체의 클래스 정보를 제공하는 getClass() 등이 있다!

        2. 다형성의 기본 구현
            부모는 자식을 담을 수 있다. Object 는 모든 클래스의 부모 클래스이다. 따라서 모든 객체를 참조할 수 있다.
            Object 클래스는 다형성을 지원하는 기본적인 메커니즘을 제공한다.
            모든 자바 객체는 Object 타입으로 처리될 수있으며, 이는 다양한 타입의 객체를 통합적으로 처리할 수 있게 해준다.
     */
}
