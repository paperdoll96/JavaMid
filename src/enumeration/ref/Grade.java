package enumeration.ref;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    // 할인률 필드 추가
    Grade(int discountPercent) {

        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // Service에 있던 할인 계산 메서드를 추가하므로 더이상 service는 필요 없어짐
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
