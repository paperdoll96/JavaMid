package lang.math;

import java.util.Random;

/*
    Random 클래스
    랜덤의 경우 Math.random() 을 사용해도 되지만 Random 클래스를 사용하면 더욱 다양한 랜덤값을 구할 수 있다!
    참고로 Math.random() 도 내부에서는 Random 클래스를 사용한다!
 */
public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
        //Random random = new Random(1); //seed가 같으면 Random의 결과가 같다. 그러니까 숫자를 하나 지정하면 그 숫자로 실행했을떄 결과는 같다는 소리! 인듯!

        int randomInt = random.nextInt(); // 랜덤 int 값을 반환
        System.out.println("randomInt: " + randomInt);

        double randomDouble = random.nextDouble(); //0.0d ~ 1.0d 랜덤 값 반환
        System.out.println("randomDouble: " + randomDouble);

        boolean randomBoolean = random.nextBoolean(); // 랜덤 boolean 값 반환
        System.out.println("randomBoolean: " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10); //0 ~ 9까지 출력
        System.out.println("0 ~ 9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; // 1부터 특정 숫자의 범위를 구할 경우 +1 !
        System.out.println("1 ~ 10: " + randomRange2);
    }


}
