package lang.string.ex;

/*
    str에서 .txt 문자열이 언제부터시작하는지 위치 출력 - indexOf()
 */
public class TestString3 {
    public static void main(String[] args) {

        String str = "hello.txt";

        System.out.println("index = " + str.indexOf(".txt"));
    }
}
