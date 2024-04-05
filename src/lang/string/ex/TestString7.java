package lang.string.ex;

public class TestString7 {

    public static void main(String[] args) {
        String original = "    Hello Java    ";
        String strip = original.strip(); // 공백을 삭제하는 메서드 strip()!   trim() 도 있다!!

        System.out.println(original + " : " + strip);
    }
}
