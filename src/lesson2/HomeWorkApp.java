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
        if ((a + b >= 10) && (a + b <= 20)) return true;
        else return false;
    }

    public static void printPositive(int a) {
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    public static boolean checkPositive(int a) {
        if (a < 0) return true;
        else return false;
    }

    public static void printLineTimes(String line, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(line);
        }
    }

    public static boolean isItLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) return true;
                else return false;
            } else return true;
        } else return false;
    }

}
