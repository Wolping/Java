class BurgerDirector {
    public Burger construct(BurgerBuilder builder) {
        builder.buildBun();
        builder.buildPatty();
        builder.buildSauce();
        builder.buildToppings();
        builder.buildSize();
        return builder.getResult();
    }
}