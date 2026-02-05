package DesignPattern.Builder.V0;

public class Client {
    public static void main(String[] args) {

        SoldItemBuilder soldItemBuilder = new SoldItemBuilder();
        soldItemBuilder.setId(1);
        soldItemBuilder.setName("Apple");
        soldItemBuilder.setQuantity(10);
        soldItemBuilder.setPrice(100);
        soldItemBuilder.setPrime(true);
        soldItemBuilder.setDiscount(10);
        soldItemBuilder.setPaymentMethod("UPI UPI UPI");

        SoldItem soldItem = new SoldItem();
        System.out.println(soldItem);

    }
}
