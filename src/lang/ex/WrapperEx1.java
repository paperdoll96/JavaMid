package lang.ex;

/*
    parseInt()로 문자로 입력된 두 수의 합 구하기
 */
public class WrapperEx1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";


        // 답 부분
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int sum = num1 + num2;

        System.out.println("두 수의 합 : " + sum);
    }
}
