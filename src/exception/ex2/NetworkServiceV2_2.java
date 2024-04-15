package exception.ex2;

/*
    예외 복구
    이번엔 예외를 잡아서 예외 흐름을 정상 흐름으로 복구 해보자!
 */
public class NetworkServiceV2_2 {

    public void sendMessage(String data)  {
        String address = "http://helloJava.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

         /*
            connect() , send() 와 같이 예외가 발생할 수 있는 곳을 try ~ catch 를 사용해서 NetworkClientExceptionV2 예외를 잡았다
         */
        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류 코드] : " + e.getErrorCode() + ", 오류 메시지 : " + e.getMessage());
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류 코드] : " + e.getErrorCode() + ", 오류 메시지 : " + e.getMessage());
            return;
        }

        client.disconnect();


    }
    /*
        남은 문제
        - 예외 처리를 했지만 예전에 했던 에제들과 같이 정상과 예외흐름이 섞여있어, 코드 읽기 힘듬
        - 사용 후에는 반드시 disconnect() 호출해서 연결 해제 해야 함
     */

}
