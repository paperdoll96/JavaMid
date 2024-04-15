package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{

    private String errorCode; // 여기서는 어떤 종류의 오류가 발생했는지 구분하기 위해 예외 안에 오류 코드를 보관한다.

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message); // 오류 메시지( message )에는 어떤 오류가 발생했는지 개발자가 보고 이해할 수 있는 설명을 담아둔다, 상위 크래스인 Throwble에서 기본으로 제공하는 기능
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
    /*
        예외도 객체이다. 따라서 필요한 필드와 메서드를 가질 수 있다
     */
}
