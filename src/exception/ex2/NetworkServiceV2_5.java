package exception.ex2;

/*
    예외 처리 5 - finally
    자바는 어떤 경우라도 반드시 호출되는 finally 기능을 제공!!
    try ~ catch ~ finally 구조는 정상 흐름, 예외 흐름, 마무리 흐름을 제공
    심지어 try , catch 안에서 잡을 수 없는 예외가 발생해도 finally 는 반드시 호출
 */
public class NetworkServiceV2_5 {

    public void sendMessage(String data)  {
        String address = "http://helloJava.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류 코드] : " + e.getErrorCode() + ", 오류 메시지 : " + e.getMessage());

        } finally {
            client.disconnect();
        }

        /*
            이점
            1. 정상 흐름과 예외 흐름을 분리해서, 코드를 읽기 쉽게 만든다.
            2. 사용한 자원을 항상 반환할 수 있도록 보장해준다
         */
    }
}
