package lang.ex;

/*
    배열에 입력된 숫자를 double로 변환해서 합 구하기
 */
public class WrapperEx2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        double sum = 0;
        for (String s : array) {
            double i = Double.parseDouble(s); // double 은 Double. 이다! 계속 Integer 쳐놓고 왜 안나오지 ㅠㅠ 이러고 있었다..
            sum += i;
        }

        System.out.println("배열의 총 합 : " + sum);
    }
}
