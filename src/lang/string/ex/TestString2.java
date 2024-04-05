package lang.string.ex;

public class TestString2 {
    public static void main(String[] args) {

        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sum =0 ;
        for (String s : arr) {
            System.out.println( s + " : " + s.length());
            sum += s.length();
        }

//        for (int i = 0; i < arr.length; i++){
//            int s = arr[i];
//            System.out.println(arr[i] + " : " + s.length());
//            sum += s.length();
//        }
        /* 일반 for 문 안까먹으려고 한번 작성해봄! */

        System.out.println("sum : " + sum);
    }
}
