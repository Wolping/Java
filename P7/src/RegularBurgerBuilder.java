class RegularBurgerBuilder implements BurgerBuilder {
    private Burger burger;

    public RegularBurgerBuilder() {
        this.burger = new Burger("Regular Bun", "Beef Patty", "Ketchup", "Lettuce, Tomato", "Medium Size");
    }

    @Override
    public void buildBun() {
        // Настройка булки (может быть опущено, если используется стандартная булка)
    }

    @Override
    public void buildPatty() {
        // Настройка начинки (может быть опущено, если используется стандартная начинка)
    }

    @Override
    public void buildSauce() {
        // Настройка соуса (может быть опущено, если используется стандартный соус)
    }

    @Override
    public void buildToppings() {
        // Настройка добавок (может быть опущено, если используются стандартные добавки)
    }

    @Override
    public void buildSize() {
        // Настройка размера (может быть опущено, если используется стандартный размер)
    }

    @Override
    public Burger getResult() {
        return burger;
    }
}