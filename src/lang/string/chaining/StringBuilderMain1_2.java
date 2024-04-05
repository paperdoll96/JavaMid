package lang.string.chaining;

/*
    builder 패키지에 StringBuilderMain1_1 예제를 체이닝써서 리팩토링하기
 */
public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4, "JAVA")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println("string = " + string);

    }

}
