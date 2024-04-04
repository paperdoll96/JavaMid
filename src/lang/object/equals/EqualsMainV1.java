package lang.object.equals;
/*
    equals() 동일성과 동등성
    동일성(Identity): == 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
    동등성(Equality): equals() 메서드를 사용하여 두 객체가 논리적으로 동등한지 확인

    동일성은 자바머신 기준이고 메모리의 참조가 기준이므로 물리적.
    동등성은 보통 사람이 생각하는 논리적인 기준에 맞춤!

 */
public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2));
    }

    /*
        동등성이라는 개념은 각각의 클래스마다 다르다! 어떤건 주민등록번호를 기반으로, 어떤곳은 회원 번호를 기반으로
        동등성을 처리 할 수 있다! 따라서 동등성 비교를 하고 싶으면 euqals() 메서드를 재정의 해야함!
        그렇지 않으면 Object는 동일성 비교를 기본으로 제공!
     */

    // 참고로 동등성 비교가 항상 필요한 것은 아님! 필요한 경우에만 equals()를 재정의 하면 됨!
    // eqauls() 와 hascode() 는 보통 함께 사용!
}
