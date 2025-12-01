package DesignPatterns.Factory;

public class Main {
    public static void main(String []args){
        BeefBurgerRestaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefBurgerRestaurant.createBurger();

        VegieBurgerRestaurant vegieBurgerRestaurant = new VegieBurgerRestaurant();
        Burger vegieBurger = vegieBurgerRestaurant.createBurger();
    }
}
