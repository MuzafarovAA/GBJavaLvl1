package lesson6;

public class TestDrive {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Васька");
        animal1.run(200);
        animal1.swim(100);

        System.out.println();

        Animal animal2 = new Animal("Лиза");
        animal2.run(1000);
        animal2.swim(-10);

        System.out.println();
        showInfo();
        System.out.println();

        Animal animal3 = new Animal("Хамстер");
        animal3.run(150);
        animal3.swim(10);

        System.out.println();

        Cat cat1 = new Cat("Мурлыка");
        cat1.run(100);
        cat1.swim(100);

        System.out.println();

        Cat cat2 = new Cat("Снежок");
        cat2.run(500);
        cat2.swim(10);

        System.out.println();
        showInfo();
        System.out.println();

        Cat cat3 = new Cat("Маруся");
        cat3.run(20);
        cat3.swim(-10);

        System.out.println();

        Dog dog1 = new Dog("Шарик");
        dog1.run(1000);
        dog1.swim(10);

        System.out.println();

        Dog dog2 = new Dog("Бобик");
        dog2.run(50);
        dog2.swim(100);

        System.out.println();
        showInfo();
        System.out.println();

        Dog dog3 = new Dog("Дружок");
        dog3.run(-200);
        dog3.swim(500);

        System.out.println();

        showInfo();
    }

    private static void showInfo() {
        System.out.println("Животных: " + (Animal.ANIMAL_COUNT == 0 ? "Нет" : Animal.ANIMAL_COUNT));
        System.out.println("Кошек: " + (Cat.CAT_COUNT == 0 ? "Нет" : Cat.CAT_COUNT));
        System.out.println("Собак: " + (Dog.DOG_COUNT == 0 ? "Нет" : Dog.DOG_COUNT));
    }

}
