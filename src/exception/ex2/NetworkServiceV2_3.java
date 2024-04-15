package exception.ex2;

/*
    예외 처리 3 - 정상, 예외 흐름 분리
    섞여있는 문제를 해결해보자!
 */
public class NetworkServiceV2_3 {

    public void sendMessage(String data)  {
        String address = "http://helloJava.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {               // 하나의 try 안에 정상 흐름을 모두 넣었다
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) { // 예외 부분은 catch 블럭에서 해결
            System.out.println("[오류 코드] : " + e.getErrorCode() + ", 오류 메시지 : " + e.getMessage());

            // 이렇게 하면 정상 흐름은 try 블럭에 들어가고, 예외 흐름은 catch 블럭으로 명확하게 분리
        }


    }
    /*
        남은 문제
        - 사용 후에는 반드시 disconnect() 를 호출해서 연결을 해제!! 이것만 남았다!
     */

}
