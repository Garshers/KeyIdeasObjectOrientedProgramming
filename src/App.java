// -----ABSTRACT CLASS----- 
// Abstraction: Creates a general template for derived classes (cannot instantiate an object of this class)
abstract class Animal {
    // Encapsulation: The 'name' field is private and hidden from other classes
    private String name;

    // Constructor of the abstract class - initializes the 'name' field
    public Animal(String name) {
        this.name = name;
    }

    // Getter - accessor method for the private 'name' field
    public String getName() {
        return name;
    }

    // Abstract method - must be implemented in derived classes
    public abstract void makeSound();

    // Concrete method in the abstract class, available to all subclasses
    public void eat() {
        System.out.println(name + " eats food.");
    }
}

// -----INHERITANCE----- The Dog class inherits from the Animal class
// This means the Dog class inherits all features and methods from the Animal class
class Dog extends Animal {

    // Constructor of the Dog class - calls the constructor of the parent class Animal
    public Dog(String name) {
        super(name);
    }

    // -----POLYMORPHISM----- Implementation of the abstract method makeSound
    // This method will be called on Animal objects but will behave according to the Dog class
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof Woof!");
    }
}

// -----INHERITANCE----- The Cat class inherits from the Animal class
// Just like the Dog class, the Cat class extends the functionality of the parent class
class Cat extends Animal {

    // Constructor of the Cat class - calls the constructor of the parent class Animal
    public Cat(String name) {
        super(name);
    }

    // -----POLYMORPHISM----- Implementation of the abstract method makeSound
    // This method will behave according to the Cat class
    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow Meow!");
    }
}

// Main class of the program
public class App {
    public static void main(String[] args) {
        // -----ABSTRACT CLASS----- 
        // Attempt to create an object of the abstract class Animal (this will always result in a compile-time error)
        // Animal animal = new Animal();

        // -----POLYMORPHISM-----
        // Polymorphism means that we can treat objects of different classes
        // (Dog and Cat) as objects of the parent class (Animal).
        Animal myDog = new Dog("Willow");   // Creating an object of the Dog class
        Animal myCat = new Cat("Daisy"); // Creating an object of the Cat class

        // -----ENCAPSULATION-----
        // Accessing the private 'name' field via the getter method (getName)
        System.out.println("\n\nDog's name: " + myDog.getName());
        System.out.println("Cat's name: " + myCat.getName());

        // Calling polymorphic methods
        // Even though the variable types are Animal, the correct methods for Dog and Cat are called
        myDog.makeSound(); // Calls the makeSound method from the Dog class
        myCat.makeSound(); // Calls the makeSound method from the Cat class

        // Calling the common eat() method from the abstract Animal class
        // The eat() method is concrete and inherited by the Dog and Cat classes
        myDog.eat();
        myCat.eat();
    }
}