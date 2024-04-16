package exception.ex4;



public class NetworkServiceV5 {

    public void sendMessage(String data)  {
        String address = "http://helloJava.com";


        // Try with resources 구문은 try 괄호 안에 사용할 자원을 명시한다.
        try(NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
            /* try 가 끝나면 자동으로 AutoCloseable.close()를 호출해서 자원을 해제! */

        } catch (Exception e) { // catch블럭이 없이 try만 있어도 close()는 호출 된다!
                                // 단지, catch 블럭은 단순히 발생한 예외를 잡아서 예외 메시지를 출력하고, 잡은 예외를 throw 를 사용해서다시 밖으로 던진다!
            System.out.println("[예외 획인] : " + e.getMessage());
            throw e;
        }
        /*
            Try with reosurces 장점!
            - 모든 리소스가 제대로 닫히도록 보장!
            - 코드 간결설 및 가독성 향상! ( 명시적인 close() 호출이 필요없어 코드가 더 간결하고 읽기 쉬워짐)
            - 스코프 범위 한정 . [예를 들어 리소스로 사용되는 client변수의 스코프가  try 블럭 안으로 한정됨!
            - 조금 더 빠른 자원 해제!
         */
    }
}
