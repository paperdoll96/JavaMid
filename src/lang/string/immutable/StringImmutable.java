package lang.string.immutable;

/*
    String - 불변객체
    string 은 불변객체이다. 따라서 절대 절대 내부의 문자열 값을 변경할 수 없다!
 */
public class StringImmutable {

    public static void main(String[] args) {
        String str1 = "hello";
        str1.concat(" java"); // concat을 사용하면 문자열을 합칠수 있음!
        System.out.println(str1); // 하지만 결과값은 hello만 출력 ㅠ 불변객체이기 때문 !

        String str2 = str1.concat(" java"); // 그래서 변경이 필요한 경우는 새로운 결과를 만들어서 반환 해줘야함!
        System.out.println(str2);
    }
    /*
        String이 불변으로 설계된 이유
        문자열 풀에 있는 String 인스턴스 값이 중간에 변경되면 같은 문자열을 참고하는 다른 변수의 값도 모두 변경된다!!
        그래서 사이드이펙트 문제 발생! 이러한 문제를 방지하기위해 불변으로 설계됨!
     */
}
