package lang.ex;

public class LottoMain {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();

        int[] numbers = lotto.generator();

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
