package lang.string.ex;

/*
    str 에서 key 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력
 */
public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

       int count = 0;
        int index = str.indexOf(key);
        System.out.println("index = " + index);

        while(index >= 0) { // index가 0 보다 크거나 같아야하는 이유는 indexOf()에서 해당 값을 찾지 못하면 -1을 반환하기 때문!!!
            index = str.indexOf(key, index+1);

            count++;
        }

        System.out.println("count = " + count);
    }
}
