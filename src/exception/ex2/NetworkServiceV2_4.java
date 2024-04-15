package exception.ex2;

/*
    예외 처리 4 - 리소스 반환 문제
 */
public class NetworkServiceV2_4 {

    public void sendMessage(String data)  {
        String address = "http://helloJava.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류 코드] : " + e.getErrorCode() + ", 오류 메시지 : " + e.getMessage());

        }

        /**
         * 이 부분을 밖으로 뺌
         */
        client.disconnect(); // 예외 처리가 끝난 다음에 정상 흐름의 마지막에 client.disconnect() 를 호출할꺼 같다

        // 하지만 문제점이 하나 있는데 바로 catch에서 잡을 수 없는 예외가 발생할 떄이다!
        //  정상적인 상황, 예외 상황 그리고 어디선가 모르는 예외를 밖으로 던지는 상황까지 모든 것을 고려해야 함....



    }
    /*
        남은 문제
        - 사용 후에는 반드시 disconnect() 를 호출해서 연결을 해제!! 이것만 남았다!
     */

}
