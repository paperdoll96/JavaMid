package exception.ex4;



import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {

        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")){ // exit를 입력하면 프로그램 정상 종료
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) { // 모든 예외 다 잡아서 처리
                exceptionHandler(e);
            }
        }

        System.out.println("프로그램 종료");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("사용자 메시지 : 죄송합니다. 알 수 엇ㅂ는 문제가 발생했습니다.");
        System.out.println(" === 개발자용 디버깅 메시지 ===");
        System.out.println();
        e.printStackTrace(); // 스택 트레이스 출력.  이 기능을 사용하면 예외가 발생한 지점을 역으로 추적할 수 있다

        // 필요하면 예외 별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx) { // 예외도 객체이므로 필요하면 instanceof 와 같이 예외 객체의 타입을 확인해서 별도의 추가 처리를 할 수 있다.
            System.out.println("[전송 오류] 전송 데이터 : " +  sendEx.getSendData() );
        }

    }


}
