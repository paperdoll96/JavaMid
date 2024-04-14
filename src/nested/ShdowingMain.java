package nested;

/*
    같은 이름의 바깥 변수 접근 방법

 */
public class ShdowingMain {

    public int value = 1;

    class Inner {
        public int value = 2;

        void go(){
            int value = 3;
            System.out.println("value = " + value); // 지역 변수인 value 우선순위가 가장 높다
            System.out.println("this.value = " + this.value); // 내부 클래스의 인스턴스에 접근
            System.out.println("ShodowingMain.value = " + ShdowingMain.this.value); // 바깥 클래스의 인스턴스에 접근
        }

    }

    public static void main(String[] args) {
        ShdowingMain main = new ShdowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
    /*
        프로그래밍에서 가장 중요한건 명확성임을 기억하자.
        이렇게 이름이 같은 경우보다 서로 다르게 지어서 명확하게 구분하자!
     */
}
