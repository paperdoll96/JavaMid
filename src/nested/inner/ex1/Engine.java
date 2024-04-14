package nested.inner.ex1;

public class Engine {
    private Car car;

    public Engine(Car car) { //  Car 인스턴스의 참조를 생성자에서 보관한다.
        this.car = car;
    }

    public void start() {
        System.out.println("충전 레벨 확인 : " + car.getChargeLevel()); // 엔진은 충전 레벨을 확인하기 위해 Car.getChargeLevel() 이 필요하다.
        System.out.println(car.getModel() +  "의 엔진을 구동합니다.");  // 엔진은 차량의 이름을 확인하기 위해 Car.getModel() 이 필요하다.
    }

}
