package exception.ex4.exception;

// 이제 NetworkClientExceptionV4 와 자식은 모두 언체크(런타임) 예외
public class NetworkClientExceptionV4 extends RuntimeException {
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
    /*
        NetworkClient에서 발생하는 모든 예외는 이 예외를 부모로 하도록 설계
     */
}
