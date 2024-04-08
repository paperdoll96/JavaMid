package lang.wrapper;

/*
    래퍼 클래스
    int는 클래스가 아니지만 int값을 가지고 클래스를 만들면된다.
    이런 특정 기본형을 감싸서 만드는 클래스를 래퍼클래스라고 함!
 */
public class MyInteger {
    private final int value;


    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target){
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
       return String.valueOf(value);
    }

    /*
        MyInteger는 int value라는 단순한 기본형 변수를 하나 가지고 있다!
        그리고 이 기본형 변수를 편리하게 사용하도록 메서드를 제공!
        MyIntegerMethodMain0 에서 compareTo() 메서드를 내부로 캡슐화
        이 클래스는 불변으로 설계!
     */
}
