package nested.inner.ex2;

import nested.inner.ex1.Car;

public class CarMain {
    public static void main(String[] args) {
        nested.inner.ex1.Car myCar = new Car("GV70", 100);
        myCar.start();
    }

    /*
        리팩토링 전에는 결과적으로 모델 이름과 충전 레벨을 외부에 노출했다. 이것은 불필요한 Car 클래스의 정보들이 추가로 외부에 노출되는 것이기 때문에 캡슐화를 떨어뜨린다.
        리팩토링 후에는 getModel() , getChargeLevel() 과 같은 메서드를 모두 제거했다. 결과적으로 꼭 필요한 메서드만 외부에 노출함으로써 Car 의 캡슐화를 더 높일 수 있다!
     */


}
