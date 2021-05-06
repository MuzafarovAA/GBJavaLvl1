package lesson6;

public class Animal {

    public static int ANIMAL_COUNT = 0;
    protected final String name;

    public Animal(String name) {
        this.name = name;
        ANIMAL_COUNT++;
    }

    public void run(int length) {
        if (length < 0) {
            System.out.println("Назад бегать никто не умеет...");
        } else {
            System.out.println(name + " пробежал(а) " + length + " м.");
        }
    }

    public void swim(int length) {
        if (length < 0) {
            System.out.println("Назад плавать никто не умеет...");
        } else {
                System.out.println(name + " проплыл(а) " + length + " м.");
         }
    }

}
