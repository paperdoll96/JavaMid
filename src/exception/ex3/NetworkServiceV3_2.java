package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data)  {
        String address = "http://helloJava.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);

            /*
                수 많은 예외를 발생시킨다고 가정 했을때, 모든 예외를 하나하나 다 잡아서 처리하는것은 상당히 번거롭다!
                그래서 아래와 같이 구성해 보았다!
             */


            } catch (ConnectExceptionV3 e) {
                System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " +
                        e.getMessage());
            } catch (NetworkClientExceptionV3 e) { // NetworkClientExceptionV3은 SendExceptionV3의 부모이기 떄문에 잡을 수 있다
                System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
            } catch (Exception e) {  // 모든 예외를 잡아서 처리하려면 마지막에 Exception 을 두면됨!
                System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
            } finally {
            client.disconnect();
        }
        /*
            주의할 점은 예외가 발생했을 때 catch 를 순서대로 실행하므로, 더 디테일한 자식을 먼저 잡아야 한다!

            참고로 '|' 를 사용해서 여러 예외를 한번에 잡을 수 도 있다
            하지만 이 경우는 공통 부모의 기능만 사용 가능!
            ex ) catch (ConnectException | SendException)
         */

    }
}
