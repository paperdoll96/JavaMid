package enumeration.ref;

public class EnumMain {
    public static void main(String[] args) {
        int price = 10000;

        Grade[] grades = Grade.values();   // values() 사용으로 Garde열거형의 모든 상수를 배열로 구함
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }


}
