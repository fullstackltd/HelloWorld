import lib.Animal;
import lib.Dog;

public class App {
    public static void main(String[] args) {
        Animal dog = new Dog("dog", 10.5);
        dog.run();
    }
}