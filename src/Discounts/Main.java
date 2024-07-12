package Discounts;

public class Main {
    public static void main(String[] args) {
        DiscountType discount = DiscountType.CHILD;
        double itemPrice = 15.50;
        System.out.printf("%.02f",discount.calculateDiscount(itemPrice));
    }
}
