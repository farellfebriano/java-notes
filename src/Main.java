import DesignPatterns.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String data = "hello worlds";
        Singleton singleton=Singleton.getInstance(data);
    }
}