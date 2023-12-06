public class BuilderPatternExample {
    public static void main(String[] args) {
        BurgerBuilder regularBurgerBuilder = new RegularBurgerBuilder();
        BurgerDirector director = new BurgerDirector();
        Burger regularBurger = director.construct(regularBurgerBuilder);
        System.out.println("Regular Burger: " + regularBurger);
    }
}