package lang.string.equals;

/*
    String 클래스 - 비교
    String 클래스를 비교할때는 == 비교가 아니라 항상 equals() 비교를 해야한다!
    - 동일성(Identity): == 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
    - 동등성(Equality): equals() 메서드를 사용하여 두 객체가 논리적으로 같은지 확인
 */
public class StringEqualsMain {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));
        // str1 과 str2 는 new String을 사용해서 각각 인스턴스를 생성했다. 서로 다른 인스턴스이니 동일성 비교는 당연히 실패!
        // 하지만 내부에 같은 "hello" 값을 가지고 있어서 논리적으로는 같음! 따라서 동등성 비교에 성공!


        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
        // 자바에서 문자열 리터럴(String str = "hello")을 사용할 때, 메모리 효율성과 성능 최적화를 위해 '문자열 풀(String Pool)'을 사용한다!
        // 클래스에 문자열 리터럴이 선언되면, 자바는 문자열 풀에 해당 문자열의 String 인스턴스를 미리 생성하고, 같은 문자열 리터럴이 다시 사용될 때는 기존에 생성된 인스턴스를 재사용!
        // 이 방식은 메모리 사용량을 줄이고, 문자열 생성 시간을 단축시키며, 따라서 성능을 최적화합니다.

        // 그래도 항상 문자열 비교는 equals()를 사용하도록 하자!
    }
}
