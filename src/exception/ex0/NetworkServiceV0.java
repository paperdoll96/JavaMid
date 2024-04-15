package exception.ex0;


/*
    실제로 외부 네트워크에 접속하는 코드는 없지만, 외부 네트워크와 접속한다고 가정
 */
public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String address = "http://helloJava.com";
        NetworkClientV0 client = new NetworkClientV0(address); // NetworkClient 를 생성하고, 이때 접속할 외부 서버 주소도 함께 전달한다.

        client.connect();
        client.send(data);
        client.disconnect();
        // Networkclietn를 사용하는데 필요한 기능들을 순서대로 호출

    }
}
