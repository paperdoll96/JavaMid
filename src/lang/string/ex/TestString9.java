package lang.string.ex;

/*
    split() - 문자열을 특정 구분자 기준으로 여러 문자열로 분할하는데 사용
    여러개니까 당연히 배열로 받아야 되는건가?
 */

public class TestString9 {
    public static void main(String[] args) {

        String email = "paperdoll@example.com";

        String[] parts = email.split("@");

        String idPart = parts[0];
        String domainPart = parts[1];

        System.out.println("idPart = " + idPart);
        System.out.println("domainPart = " + domainPart);

    }
}
