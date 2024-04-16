package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {

    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV4(String address) {

        this.address = address;
    }

    /*
        언체크 예외로 바꿔서 thorws를 사용하지 않음!
     */
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
}
