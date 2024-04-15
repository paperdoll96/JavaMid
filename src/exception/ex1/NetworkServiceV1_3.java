package exception.ex1;

/*
    1_2에 있던 문제인
    disconnect()를 반드시 호출하도록 코드 변경해보기
 */
public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://helloJava.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);

        /*
            프로그램에서 return 문을 제거하고 if 문으로 적절한 분기를 사용
            connect() 에 성공해서 오류가 없는 경우에만 send() 를 호출
            중간에 return 하지 않으므로 마지막에 있는 disconnect() 를 호출
         */
        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류발생] 오류 코드 : " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)){
                System.out.println("[네트워크 오류발생] 오류 코드 : " + sendResult);
            }
        }

        client.disconnect();
        /*
            이렇게 함으로써 connect() 실패한 경우 send() 호출하면 안됨 - > 해결
            사용후에는 반드시 disconnect() 를 호출해셔 연결해제 -> 해결
         */

    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }

}
