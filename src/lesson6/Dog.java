package lesson6;

public class Dog extends Animal {

    public static int DOG_COUNT = 0;

    public Dog(String name) {
        super(name);
        DOG_COUNT++;
    }

    public void run(int length) {
        if (length > 500) {
            System.out.println("Собака столько не бегает!");
        } else {
            super.run(length);
        }
    }

    public void swim(int length) {
        if (length > 10) {
            System.out.println("Собака столько не плавает!");
        } else {
            super.swim(length);
        }
    }

}
