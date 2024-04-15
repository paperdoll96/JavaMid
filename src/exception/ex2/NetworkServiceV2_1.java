package exception.ex2;


public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 { // 예외 처리하지않고, throws를 통해 밖으로 던진다
        String address = "http://helloJava.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();


    }


}
