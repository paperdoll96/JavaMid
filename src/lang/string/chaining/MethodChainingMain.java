package lang.string.chaining;

/*
    메서드체이닝

 */
public class MethodChainingMain {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        int result = adder.add(1).add(2).add(3).getValue();

        System.out.println("result = " + result);
    }
    /*
        메서드 호출의 결과로 자기 자신의 참조값을 반환하면, 반한된 참조값을 사용해서 메서드 호출을 계속 이어나갈수 있음!
        메서드 체이닝 기법은 코드를 간결하고 읽기 쉽게 만들어준다!
     */
}
