
# SINGLETON

A Singleton is a design pattern that ensures:

✅ Only ONE object of a class can ever exist
and

✅ Everyone uses that SAME object.


### Singleton Pattern Code

```java
class Singleton{
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data){
        this.data=data;
    }

    public static Singleton getInstance(String data){
        Singleton result = instance;
        if (result == null){
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }
```

## Synchronized Keyword
It locks an object or method so only one thread can run that section at a time.

This prevents:
- Two threads modifying the same variable at the same time
- Race conditions
- Inconsistent values


```java 
/* 
*   Effect: 
*   When Thread A is running this method, Thread B must wait until Thread A finishes.
*/ 

public synchronized void increment() {
    count++;
}
```

```java 
/* 
*   Effect: 
*   Same idea, but you lock only a portion of code.
*/ 

public void increment() {
    synchronized(this) {
        count++;
    }
}
```

## Volatile Keyword
When one thread updates a volatile variable:
- the new value is immediately written to main memory
- all other threads see the updated value right away
  Without volatile, a thread might read an old value stored in its CPU cache.