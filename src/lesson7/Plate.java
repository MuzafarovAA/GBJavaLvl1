package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int eatAmount) {
        if (food < eatAmount) {
            return false;
        } else {
            food -= eatAmount;
            return true;
        }
    }

    public void addFood(int addedFood) {
        food += addedFood;
    }

    public void info() {
        System.out.println("Food amount: " + food);
    }
}
