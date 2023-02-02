package lib;

public abstract class Animal {
    String name;
    double speed;
    Animal(String name, double speed){
        this.name = name;
        this.speed = speed;
    }
    public abstract void run();
}
