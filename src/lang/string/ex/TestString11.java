package lang.string.ex;

public class TestString11 {
    public static void main(String[] args) {

        String str = "Hello Java";

        String strReverse = new StringBuilder(str).reverse().toString();
        // 체이닝으로 한번에 싹~정리

        System.out.println(strReverse);


    }
}
