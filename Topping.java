public enum Topping {
    PEPPERONI("Pepperoni", 10.0),
    MUSHROOM("Mushroom", 10.0),
    ONION("Onion", 10.0),
    CHEESE("Extra Cheese", 15.0),
    PINEAPPLE("Pineapple", 10.0);

    private final String name;
    private final double price;

    Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
