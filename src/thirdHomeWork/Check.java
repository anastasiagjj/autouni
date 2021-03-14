package thirdHomeWork;

public class Check {

    public static void main(String[] args) {
        DishWasher dishWasher = new DishWasher(15);

        dishWasher.putDishes(11);
        dishWasher.start();
        dishWasher.stop();
        dishWasher.takeAllDishes();
        dishWasher.start();
    }

}
