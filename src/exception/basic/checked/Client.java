package exception.basic.checked;

public class Client {

    public void call() throws MyCheckedException {
        throw new MyCheckedException("ex");
    }

    /*
        - throw 예외 라고 하면 새로운 예외를 발생시킬 수 있다. 예외도 객체이기 때문에 객체를 먼저 new 로 생성하고 예외를 발생시켜야 함
        - throws 예외 는 발생시킨 예외를 메서드 밖으로 던질 때 사용하는 키워드
        - throw 와 throws 차이 주의
     */
}
