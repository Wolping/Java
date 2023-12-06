interface BurgerBuilder {
    void buildBun();
    void buildPatty();
    void buildSauce();
    void buildToppings();
    void buildSize();
    Burger getResult();
}