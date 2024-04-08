package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int i1 = myInteger.compareTo(5);
        int i2 = myInteger.compareTo(10);
        int i3 = myInteger.compareTo(20);


        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }



    /*
      myInteger.compareTo() 는 자기 자신의 값을 외부의 값과 비교한다.
      MyInteger 는 객체이므로 자신이 가진 메서드를 편리하게 호출할 수 있다.
      참고로 int 는 기본형이기 때문에 스스로 메서드를 가질 수 없다.
     */
}

