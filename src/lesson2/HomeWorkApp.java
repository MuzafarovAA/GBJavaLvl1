package lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        checkSum(5, 2);
        printPositive(-5);
        checkPositive(100);
        printLineTimes("Halo", 5);
        isItLeapYear(1600);
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return (sum >= 10) && (sum <= 20);
    }

    public static void printPositive(int a) {
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    public static boolean checkPositive(int a) {
        return a < 0;
    }

    public static void printLineTimes(String line, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(line);
        }
    }

    public static boolean isItLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}
