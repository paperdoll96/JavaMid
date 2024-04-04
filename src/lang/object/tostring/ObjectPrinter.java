package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object object) {
        String string = "객체 정보 출력 " + object.toString();
        System.out.println(string);
    }
    // "객체 정보 출력:" 이라는 문자와 객체의 toString() 결과를 합해서 출력하는 단순한 기능을 제공한다.
}
