package lang.object.tostring;

/*
    toString()
    Object.toString() 메서드는 객체의 정보를 문자열 형태로 제공! 디버깅과 로깅에 유용하게 사용!
    이 메서드는 Object클래스에 정의되므로 모든 클래스에서 상속 받아 사용 가능!
 */
public class ToStringMain1 {
    public static void main(String[] args) {

        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string);
        //object 직접 출력
        System.out.println(object);

        // Object 가 제공하는 toString() 메서드는 기본적으로 패키지를 포함한 객체의 이름과 객체의 참조값(해시코드)를 16진수로 제공
    }
}
