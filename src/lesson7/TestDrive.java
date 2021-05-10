package lesson7;

public class TestDrive {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cat = new Cat[5];

        cat[0] = new Cat("Барсик", 10);
        cat[1] = new Cat("Снежок", 15);
        cat[2] = new Cat("Муркин", 50);
        cat[3] = new Cat("Лиза", 30);
        cat[4] = new Cat("Васька", 20);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
        }

        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i].toString());
        }

        plate.info();
        plate.addFood(50);
        plate.info();
    }
}
