package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://helloJava.com";
        NetworkClientV1 client = new NetworkClientV1(address); // NetworkClient 를 생성하고, 이때 접속할 외부 서버 주소도 함께 전달한다.

        client.initError(data); // 추가. 사용자의 입력 값을 기반으로 오류를 활성화 한다.

        client.connect();
        client.send(data);
        client.disconnect();
        // Networkclietn를 사용하는데 필요한 기능들을 순서대로 호출

    }
}
