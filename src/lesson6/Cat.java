package lesson6;

public class Cat extends Animal {

    public static int CAT_COUNT = 0;

    public Cat(String name) {
        super(name);
        CAT_COUNT++;
    }

    public void run(int length) {
        if (length > 200) {
            System.out.println("Кот столько не бегает!");
        } else {
            super.run(length);
        }
    }

    public void swim(int length) {
        System.out.println("Кот не умеет плавать!");
    }

}
