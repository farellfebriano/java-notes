# Factory Method Design Pattern

- Centralize the product creation code in one place the program
- Allows introducing new products without breaking existing code
- Use it if you have noe idea of the exact types of the objects your code will work with
- makes it easy to extend the product independently from the rest of application

## Factory Method Structure
1.) Creator (abstract class)
Has a factory method like createProduct()

2.) ConcreteCreator
Overrides createProduct() to return a specific product

3.) Product (interface/class)
Defines what all products must implement

4.) ConcreteProduct
Actual class returned by the factory method
