package lang.string.ex;

/*
    java를 jvm 으로 바꾸기 - replace()
 */
public class TestString8 {
    public static void main(String[] args) {

        String input = "hello java spring jpa java";

        String output = input.replace("java", "jvm");

        System.out.println(output);
    }
}
