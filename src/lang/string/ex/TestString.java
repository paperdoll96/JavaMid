package lang.string.ex;

public class TestString {

    public static void main(String[] args) {
        String url = "https://www.example.com";

        boolean reuslt = url.startsWith("https://");
        // 아 이거 처음에 String객체로 선언했는데 왜 자꾸 오류뜨지 했는데 알고보니까 결과값이 참거짓이라
        // boolean을 썼어야 했네..

        System.out.println(reuslt);
    }
}
