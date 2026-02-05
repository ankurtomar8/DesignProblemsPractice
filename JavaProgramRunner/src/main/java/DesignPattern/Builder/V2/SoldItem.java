package DesignPattern.Builder.V2;

public class SoldItem {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private boolean isPrime;
    private double discount;
    private String paymentMethod;

    public SoldItem(SoldItemBuilder soldItemBuilder) {
     // Validation can be done here also

        this.id = soldItemBuilder.getId();
        this.name = soldItemBuilder.getName();
        this.price = soldItemBuilder.getPrice();
        this.quantity = soldItemBuilder.getQuantity();
        this.isPrime = soldItemBuilder.isPrime();
        this.discount = soldItemBuilder.getDiscount();
        this.paymentMethod = soldItemBuilder.getPaymentMethod();

    }

    // Original Class is taking the responsibility of setting the values
    public static SoldItemBuilder getBuilder(){
        return new SoldItemBuilder();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if(quantity < 5 ){
            throw new IllegalArgumentException("Quantity cannot be less than 5");
        }

        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public static class SoldItemBuilder {

        private int id;
        private String name;
        private int quantity;
        private double price;
        private boolean isPrime;
        private double discount;
        private String paymentMethod;

        public SoldItem build() {
            return new SoldItem(this);
        }
        public int getId() {
            return id;
        }

        public SoldItemBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public SoldItemBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public SoldItemBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }


        public SoldItemBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public SoldItemBuilder setPrime(boolean prime) {
            isPrime = prime;
            return this;
        }

        public SoldItemBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public SoldItemBuilder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }

        public boolean isPrime() {
            return isPrime;
        }

        public double getDiscount() {
            return discount;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }
    }
    
    


}
