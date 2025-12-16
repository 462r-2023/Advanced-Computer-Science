class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public Boolean isExpensive() {
        return price > 50.0;
    }

    public String toString() {
        if (isExpensive()) {
            return name + " is a premium item at $" + price;
        }
        return name + " is a regular item at $" + price;
    }
}
