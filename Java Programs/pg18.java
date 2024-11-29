class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog dog = new Dog();

        // Create an instance of the Cat class
        Cat cat = new Cat();

        // Access methods from both the Dog and Cat classes
        dog.eat(); // Inherited from Animal class (shared by Dog and Cat)
        dog.bark(); // Defined in Dog class
        cat.eat(); // Inherited from Animal class (shared by Dog and Cat)
        cat.meow(); // Defined in Cat class
    }
}
