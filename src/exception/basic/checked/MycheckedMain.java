package exception.basic.checked;

public class MycheckedMain {
    public static void main(String[] args) {
        Service service = new Service();

        service.callCatch();
        System.out.println("종료");
    }
}
