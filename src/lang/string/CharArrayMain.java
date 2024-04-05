package lang.string;

/*
    String 클래스 - 기본
    자바에서 문자를 다루는 대표적인 타입은 char, String 2가지가 있다!
 */
public class CharArrayMain {

    public static void main(String[] args) {
        char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'};  // 기본형인 char 는 문자 하나를 다룰 때 사용한다. char 를 사용해서 여러 문자를 나열하려면 char[] 을 사용해야 한다
        System.out.println(charArr);

        String str = "hello"; // 위와 같이 불편한 문제 떄문에 자바는 문자열을 매우 편리하게 다룰 수 있는 String 클래스를 제공!
        System.out.println("str = " + str);
    }
}
