package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }
    /*
        위 처럼 두가지 방법이 있는데 String은 클래스이다! int, boolean 같은 기본형이 아니라 참조형!
        문자열은 매우 자주 사용된다. 그래서 편의상 쌍따옴표로 문자열을 감싸면 친절하게도 자바가 new String("hello") 와 같이 변경해줌!

        주요 메서드
        length() : 문자열의 길이를 반환
        charAt(int index) : 특정 인덱스의 문자를 반환
        substring(int beginIndex, int endIndex) : 문자열의 부분 문자열을 반환
        indexOf(String str) : 특정 문자열이 시작되는 인덱스를 반환
        toLowerCase() , toUpperCase() : 문자열을 소문자 또는 대문자로 변환
        trim() : 문자열 양 끝의 공백을 제거
        concat(String str) : 문자열을 더함

        그리고 String은 참조형이라서 원칙적으로 +같은 연산을 사용 할 수 없다!!!
        원래는 concat() 같은 메서드를 사용해서 문자열을 더해야하지만 문자열은 자주 다루어져 자바가 편의상 + 연산을제공!
     */
}
