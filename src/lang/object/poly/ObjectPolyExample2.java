package lang.object.poly;

/*
    Object 다형성
 */
public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // Object도 인스턴스 만들 수 있음!!

        Object[] objects = {dog, car, object}; // Object타입을 사용한 덕분에 모든 객체를 담을 수 있느 배열을 만듬!

        getSize(objects);
    }

    private static void getSize(Object[] objects) {
        System.out.println("전달된 객체의 수는 : " + objects.length);
    }

    /*
        Object가 없다면..?
        void action(Object object)과 같이 모든 객체를 받을 수 있는 메서드를 만들 수 없다!
        Object[] objects 처럼 모든 객체를 저장 할 수 있는 배열을 만들 수 없다!

        사실 안되는건 아니지만 직접 만든다면 진짜진짜진짜 복잡한 코드와 호환 되지 않는 수만은 Object들이 넘쳐 날듯..
     */
}
