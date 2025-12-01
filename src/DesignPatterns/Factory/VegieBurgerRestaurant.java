package DesignPatterns.Factory;

public class VegieBurgerRestaurant extends Restaurant{
    public Burger createBurger(){
        System.out.println("vegie burger object is created");
        return new VegieBurger();
    }
}
