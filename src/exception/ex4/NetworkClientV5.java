package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

/*
    try 가 끝나면 외부 자원을 반납하는 패턴이 반복되면서 자바에서는 Try with  resources라는 편의 기능을 자바 7에서 도입했다.
    이름 그대로 try 에서 자원을 함께 사용한다는 뜻이다. 여기서 자원은 try 가 끝나면 반드시 종료해서 반납해야 하는 외부 자원을 뜻한다
 */
public class NetworkClientV5 implements AutoCloseable {  // 이 기능을 사용하기위해 AutoCloseable 인터페이스를 구현

    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV5(String address) {

        this.address = address;
    }

    public void connect()  {
        // 연결 실패
        if (connectError) {
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        // 전송 실패
        if (sendError) {
            throw new SendExceptionV4(address, address + " 서버에 데이터 전송 실패 : " + data);
        }
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    public void disconnect() {  // 외부 서버와 연결 해제
        System.out.println(address + "연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }

    @Override
    public void close() { // 이 인터페이스를 구현하면 try가 끝나는 시점에 close()가 자동으로 호출
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}
