package lang.object.poly;

/*
    Object 다형성
 */
public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object object) {
        //object.sound(); // 컴파일 오류 Object는 sound()가 없다
        //object.move(); // 마찬가지!

        // 그러므로 객체에 맞는 다운캐스팅이 필요 ㅠㅠ 다운캐스팅이 잘 기억안나면 java-basic으로 가서 찾아보장!
        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car car) {
            car.move();
        }
    }

    /*
        Object 다형성의 장점은 모든 객체의 부모이기 때문에 어떤 객체든지 담을 수 있다!
        하지만 한계가 있는데, action() 메서드안에서 사운드를 호출하면 오류가 발생한다.
        이유는 Object타입인데 Object에는 sound() 메서드가 없기 때문!
        (메서드를 찾을때는 자신이 없으면 위로 가서 찾는다는걸 명심하자!)
        그래서 전달 받은 객체를 호출하려면 객체에 맞는 다운캐스팅을 해줘야함!

        엥? 오버라이딩 사용하면 괜찮지 않을까? 라는 생각을 했지만 Object 에는
        Dog.sound() , Car.move() 와 같은 다른 객체의 메서드가 정의되어 있지 않다.
        따라서 메서드 오버라이딩을 활용할 수 없다..

        결과적으로 다형적 '참조'는 가능하지만 '활용'하기에는 한계가 있다..
     */
}
