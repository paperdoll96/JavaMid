package lang.string.builder;
/*
    StringBuilder - 가번 String
    불변인 String 클래스의 주요 단점은 문자열을 변경할 때마다 새로운 객체를 생성한다는 것!
    이는 문자열 연산이 빈번하게 발생하는 경우, 시스템의 CPU와 메모리 자원을 많이 사용하게 만듬!

    이런 문제를 해결하기 위해 자바는 StringBuilder라는 '가변 String' 을 제공!
 */
public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");  // 메서드를 사용해 여러 문자열 추가
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java"); // 메서드로 특정 위치에 문자열 추가
        System.out.println("insert = " + sb);

        sb.delete(4, 8); // 메서드로 특정 범위 문자열 삭제
        System.out.println("delete = " + sb);

        sb.reverse(); // 메서드로 문자열 뒤집기
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        String string = sb.toString(); // toString 메소드를 사용해서 결과를 기반으로 String을 생성해서 반환
        System.out.println("string = " + string);
    }
    /*
        String 은 불변하다. 즉, 한 번 생성되면 그 내용을 변경할 수 없다. 따라서 문자열에 변화를 주려고 할 때마다 새로운 String 객체가 생성되고,
        기존 객체는 버려진다. 이 과정에서 메모리와 처리 시간을 더 많이 소모한다.

        반면에, StringBuilder 는 가변적이다. 하나의 StringBuilder 객체 안에서 문자열을 추가, 삭제, 수정할수 있으며,
        이때마다 새로운 객체를 생성하지 않는다. 이로 인해 메모리 사용을 줄이고 성능을 향상시킬 수 있다.
        단 사이드 이펙트를 주의해야 한다.
     */
}
