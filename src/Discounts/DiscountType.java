package Discounts;

public enum DiscountType {
    CHILD(0.3),
    STUDENT(0.1),
    SENIOR(0.2),
    DISABLED(0.5);

    private final double percentage;

    DiscountType(double percentage) {
        this.percentage = percentage;
    }

    public double calculateDiscount(double price) {
        return price - (price * percentage);
    }

    public double getPercentage() {
        return percentage;
    }
}
