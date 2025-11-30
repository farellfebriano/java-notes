package DesignPatterns.Singleton;

public class Singleton{
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data){
        this.data=data;
    }

    public static Singleton getInstance(String data){
        // read the instance from local variable not fetching main memory
        Singleton result = instance;
        if (result == null){
            synchronized (Singleton.class) {
                // restore the instance incase any thread create the object
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }
}

// the code will skiping synchronization when retrieving an already created instance
// limiting synchronization to the rare case of construction a new instance of this field