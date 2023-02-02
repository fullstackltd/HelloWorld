package lib;

public class Dog extends Animal {
    public Dog(String name, double speed) {
        super(name, speed );
    }

    @Override
    public void run() {
        System.out.println("Can run");
    }

}
