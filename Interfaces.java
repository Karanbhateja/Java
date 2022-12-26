// Define the Animal interface with a single method, makeSound
interface Animal{
    void makeSound();
}

// Implement the Animal interface with the dog class
class dog implements Animal{
    // Override the makeSound method and print "Bark"
    public void makeSound(){
        System.out.println("Bark");
    }
}

// Implement the Animal interface with the cat class
class cat implements Animal{
    // Override the makeSound method and print "Meoww"
    public void makeSound(){
        System.out.println("Meoww");
    }
}

// Define the Interfaces class with a main function
public class Interfaces{
    public static void main(String[] args) {
        // Create a dog object and call its makeSound method
        dog d = new dog();
        d.makeSound();

        // Create a cat object and call its makeSound method
        cat c = new cat();
        c.makeSound();
    }
}
