package DesignPattern.Builder.V1;

public class Client {
    public static void main(String[] args) {

        // Way 1: Using long and multiple constructor ex: new SoldItem(1,"Apple",10,100,true,10,"UPI UPI UPI")
        // Way 2: Using Setters set.Attribute();
        // Way 3: Using HashMap
        // Way 4: Using Builder Pattern

  /*      SoldItemBuilder soldItemBuilder = new SoldItemBuilder();
        soldItemBuilder.setId(1);
        soldItemBuilder.setName("Apple");
        soldItemBuilder.setQuantity(10);
        soldItemBuilder.setPrice(100);
        soldItemBuilder.setPrime(true);
        soldItemBuilder.setDiscount(10);
        soldItemBuilder.setPaymentMethod("UPI UPI UPI");

        SoldItem soldItem = new SoldItem();
        System.out.println(soldItem);
*/
    }
}
