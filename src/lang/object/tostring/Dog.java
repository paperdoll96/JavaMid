package lang.object.tostring;

public class Dog {
    private String dogName; // 개 이름
    private int age; // 나이

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    @Override
    public String toString() { // toString 재정의
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }

    // generator 단축키 윈도우 기준 alt + insert  맨날 까묵네..
}
