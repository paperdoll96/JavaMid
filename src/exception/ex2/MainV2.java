package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 { // 여기서도 예외를 밖으로 던져보자

//        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
//        NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
          NetworkServiceV2_3 networkService = new NetworkServiceV2_3();

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")){ // exit를 입력하면 프로그램 정상 종료
                break;
            }
            networkService.sendMessage(input); // 를 통해 메시지 전달
            System.out.println();
        }

        System.out.println("프로그램 종료");
    }
    /*
        남은문제
        1. 예외 처리를 도입했지만, 아직 예외가 복구되지 않는다. 따라서 예외가 발생하면 발생하면 프로그램이 종료된다.
        2. 사용 후에는 반드시 disconnect() 를 호출해서 연결을 해제해야 한다.
     */

}
