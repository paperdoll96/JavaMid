package exception.ex2;

public class NetworkClientV2 {

    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {  // 오류가 발생했을 때 오류 코드를 반환하는 것이 아니라 예외를 던진다
                                                             // 따라서 반환 값을 사용하지 않아도 되서 void로 처리
        // 연결 실패
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
                    }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 { // 오류가 발생했을 때 오류 코드를 반환하는 것이 아니라 예외를 던진다
                                                                    // 따라서 반환 값을 사용하지 않아도 되서 void로 처리
        // 전송 실패
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패 : " + data);
        }
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    public void disconnect() {  // 외부 서버와 연결 해제
        System.out.println(address + "연결 해제");
    }

    // 사용자 입력 값에 "error1"이 있으면 connectError 오류가 발생하고, "error2"가 있으면 sendError오류가 발생한다.
    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
