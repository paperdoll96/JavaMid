package exception.basic.checked;

/**
 * Checked 예외는
 * 예외를 잡아서 처리하거나, 던지거나 둘중 하나를 필수로 선택해야 한다.
 */
public class Service {
    Client client = new Client();

    /**
        예외를 잡악서 처리하는 코드
     */
    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) { // 만약 try 에서 잡은 예외가 catch 의 대상에 없으면 예외를 잡을 수 없다. 이때는 예외를 밖으로 던져야 함
                            // catch에 MyCheckedException의 상위 타입인 Exception을 적어도 잡을 수 있음!
            // 예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정 상 흐 름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언.
     */
    public void callThrow() throws MyCheckedException { // catch와 마찬가지로 상위타입인 Exception을 적어주어도 던질 수 있음
        client.call();
    }
    /*
        Service.callThrow() 안에서 예외를 처리하지 않고, 밖으로 던졌기 때문에 예외가 main() 메서드까지 올라오고,
        예외가 main() 밖으로 던져지면 예외 정보와 스택 트레이스(Stack Trace)를 출력하고 프로그램이 종료
     */

}
