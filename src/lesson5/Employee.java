package lesson5;

public class Employee {
    private final String name;
    private final String position;
    private final String email;
    private final int phone;
    private final int salary;
    private final int age;

    public Employee(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Электронная почта: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public int getAge() {
        return age;
    }
}
