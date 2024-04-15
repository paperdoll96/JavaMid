package exception.ex1;

/*
    예외 처리가 필요한 이유2 - 오류 상황 만들기

    오류 상황을 가상으로 시뮬레이션 해보기
 */
public class NetworkClientV1 {

    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() { // 외부 서버 연결
        // 연결 실패
        if (connectError) { // 이 필드의 값이 true 가 되면 연결에 실패하고, connectError 오류 코드를 반환한다.
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) { // 연결한 외부 서버에 데이터 전송
        // 전송 실패
        if (sendError) { // 이 필드의 값이 true 가 되면 연결에 실패하고, sendError 오류 코드를 반환한다.
            System.out.println(address + " 서버에 데이터 전송 실패 : " + data );
            return "sendError";
        }

        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
        return "success";
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
