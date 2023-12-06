class Burger {
    private String bun;
    private String patty;
    private String sauce;
    private String toppings;
    private String size;

    public Burger(String bun, String patty, String sauce, String toppings, String size) {
        this.bun = bun;
        this.patty = patty;
        this.sauce = sauce;
        this.toppings = toppings;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings='" + toppings + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}