package exception.ex1;

/*
    반환 값으로 예외 처리 해보기
    앞에서 발생한 문제는 연결에 실패하면 데이터를 전송하지 않아야 하는데 데이터를 전송하는점.
    그리고 오류로그를 남겨야 한다 이 문제를 해결해 보자!
 */
public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://helloJava.com";
        NetworkClientV1 client = new NetworkClientV1(address); // NetworkClient 를 생성하고, 이때 접속할 외부 서버 주소도 함께 전달한다.

        client.initError(data); // 추가. 사용자의 입력 값을 기반으로 오류를 활성화 한다.

        String connectResult = client.connect();
        if (isError(connectResult)){
            System.out.println("[네트워크 오류발생] 오류 코드 : " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)){
            System.out.println("[네트워크 오류발생] 오류 코드 : " + sendResult);
            return;
        }

        client.disconnect();
        // Networkclietn를 사용하는데 필요한 기능들을 순서대로 호출

    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }

    /*
        connect() 가 실패한 경우 send() 를 호출 하면 안되는 부분은 해결!
        하지만 사용후에 disconnect()를 반드시 호출해야 하는 문제는 해결 X
        계속 이렇게 두면 네트워크 연결 자원이 고갈 될 수 있는 경우가 발생! 반드시 처리해야 할 문제!
     */
}
