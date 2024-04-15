package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {

//        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
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

}
