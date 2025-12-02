# Factory Method Design Pattern

- Centralize the product creation code in one place the program
- Allows introducing new products without breaking existing code
- Use it if you have noe idea of the exact types of the objects your code will work with
- makes it easy to extend the product independently from the rest of application

## Factory Method Structure
![App Screenshot](https://github.com/farellfebriano/java-notes/blob/main/src/DesignPatterns/Factory/diagram/Screenshot%202025-12-02%20at%201.02.37%E2%80%AFPM.png?raw=true
)
<br>
1.) Creator (abstract class)
Has a factory method like createProduct()

2.) ConcreteCreator
Overrides createProduct() to return a specific product

3.) Product (interface/class)
Defines what all products must implement

4.) ConcreteProduct
Actual class returned by the factory method

## CODE
![App Screenshot](https://github.com/farellfebriano/java-notes/blob/main/src/DesignPatterns/Factory/diagram/Screenshot%202025-12-02%20at%201.06.09%E2%80%AFPM.png?raw=true)
<br>
![App Screenshot](https://github.com/farellfebriano/java-notes/blob/main/src/DesignPatterns/Factory/diagram/Screenshot%202025-12-02%20at%201.06.51%E2%80%AFPM.png?raw=true)




