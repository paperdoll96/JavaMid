package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {

        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();

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
        남은 문제
            연결이 실패 하면 데이터를 전송하지 않아야 하는데, 여기서는 데이터를 전송하는 문제가 발생
     */
}
