package exception.ex4;



public class NetworkServiceV4 {

    public void sendMessage(String data)  {
        String address = "http://helloJava.com";

        NetworkClientV4 client = new NetworkClientV4(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
            } finally {
            client.disconnect();
        }
        /*
            NetworkServiceV4 개발자 입장에서는 해당 예외들을 복구할 수 없다.
            따라서 해당 예외들을 생각하지 않는 것이 더 나은 선택일 수 있다. 해결할 수 없는 예외들은 다른 곳에서 공통으로 처리된다.
            이런 방식 덕분에 NetworkServiceV4 는 해결할 수 없는 예외 보다는 본인 스스로의 코드에 더 집중할 수 있다. 따라서 코드가 깔끔해진다.
         */
    }
}
