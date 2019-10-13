package lessonfour;

//subclass
public class Cat extends Animal {

    Cat() {
        System.out.println("It is constructor Cat");
    }

    void meow() {
        System.out.println("Meow");
    }

    //owerriding

    void eat() {
        super.eat();
        System.out.println("Cat eats and goes to sleep");
    }
}
