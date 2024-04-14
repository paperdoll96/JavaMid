package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작완료");
    }

    public class Engine {

        public void start() {
            System.out.println("충전 레벨 확인 : " + chargeLevel); // Car의 인스턴스 변수인 cahrgeLevel에 직접 접근 할 수 있따
            System.out.println(model +  "의 엔진을 구동합니다.");   // Car의 인스턴스 변수인 model에 직접 접근 할 수 있따
        }

    }

    /*
        바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때 내부 클래스의 인스턴스는 자신을 생성한 바깥 클래스의 인스턴스를 자동으로 참조한다.
        여기서 new Engine() 로 생성된 Engine 인스턴스는 자신을 생성한 바깥의Car 인스턴스를 자동으로 참조한다.
     */
}
