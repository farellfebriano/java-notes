package DesignPatterns.Factory;

public class BeefBurgerRestaurant extends Restaurant {
    public Burger createBurger(){
        System.out.println("Beef burger object is created");
        return new BeefBurger();
    }
}
