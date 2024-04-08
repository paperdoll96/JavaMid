package lang.wrapper;

/*
    기본형의 한계
    자바는 객체 지향 언어이다. 그런데 자바 안에 객체가 아닌 것이 있다. 바로 int, double 같은 기본형이다!
    기본형은 객체가 아니기 때문에 메서드를 제공할 수 없고, 기본형은 항상 값을 가지기 때문에 null값을 가질수 없다!
 */
public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;

        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);

    }

    public static int compareTo(int value, int target) {
        if (value < target){
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    /*
        여기서는 value 와 비교 대상 값을 compareTo() 라는 외부 메서드를 사용해서 비교한다. 그런데 자기 자신인
        value 와 다른 값을 연산하는 것이기 때문에 항상 자기 자신의 값인 value 가 사용된다. value가 객체라면?
        객체 스스로 자기 자신의 값과 다른 값을 비교하는 메서드를 만드는것이 더 유용할듯!
     */
}

