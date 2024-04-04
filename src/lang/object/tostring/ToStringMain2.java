package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog1 = new Dog("바둑이", 5);
        Dog dog2 = new Dog("오목이", 10);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        //println 내부에서 toString 호출
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    /*
        Car 인스턴스는 toString() 을 재정의 하지 않았기 떄문에 Object가 제공하는 기본 toString메스드 사용
        Dog 인스턴스는 toStirng() 을 재정의 해서 객체의 상태를 명확하게 확인!
     */

    /*
        참고 - 객체 참조값 직접 출력
        toString() 은 기본으로 객체의 참조값을 출력한다.
        그런데 toString() 이나 hashCode() 를 재정의하면 객체의 참조값을 출력할 수 없다!
        이때는 다음 코드를 사용하면 객체의 참조값을 출력할 수 있다.
     */
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        // System.identityHashCode(dog1) dog1의 참조값을 해쉬코드로 반환
        // Integer.toHexString 으로 해쉬코드를 우리에게 익숙(?)한 16진수로 변경
        // refvalue에 대입
        System.out.println("refValue = " + refValue);
    }

}
