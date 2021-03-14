package thirdHomeWork;

import java.util.InputMismatchException;

public class DishWasher {

    private int maxQuantityDishes;
    private boolean isStarted = false;
    private boolean hasCleanDishes = false;
    private boolean isEmpty = true;

    DishWasher(int maxQuantityDishes) {
        if(maxQuantityDishes <= 0) {
            throw new InputMismatchException("Input number must be > 0");
        }
        this.maxQuantityDishes = maxQuantityDishes;
    }

    /**
     * Put dishes in Dish Washer
     * @param quantityOfDishes is a number of dishes, that is going to be placed in Dish Washer
     * Sets isEmpty = false
     * @throws AlreadyStartedDishWasherException if Dish Washer has been started
     * @throws CleanDishesInDishWasherException if Dish Washer has clean dishes
     * @throws InputMismatchException if quantityOfDishes is more than max quantity of dishes, that Dish Washer can accommodate.
     */
    public void putDishes(int quantityOfDishes) {
        if (isStarted) {
            throw new AlreadyStartedDishWasherException();
        }
        if (hasCleanDishes) {
            throw new CleanDishesInDishWasherException();
        }
        if (maxQuantityDishes < quantityOfDishes) {
            throw new InputMismatchException("Quantity of dishes is more than max quantity of dishes");
        }
        isEmpty = false;
    }

    /**
     * Take all dishes from Dish Washer.
     * Sets false for hasCleanDishes and true for isEmpty.
     */
    public void takeAllDishes() {
        hasCleanDishes = false;
        isEmpty = true;
    }

    /**
     * Start Dish Washer.
     * @throws EmptyDishWasherException if Dish Washer is empty.
     * @throws CleanDishesInDishWasherException if Dish Washer has clean dishes.
     * @throws AlreadyStartedDishWasherException if Dish Washer has been already started.
     * As result sets isStarted = true.
     */
    public void start() {
        if (isEmpty) {
            throw new EmptyDishWasherException();
        }
        if (hasCleanDishes) {
            throw new CleanDishesInDishWasherException();
        }
        if (isStarted) {
            throw new AlreadyStartedDishWasherException();
        }
        isStarted = true;
    }

    /**
     * Stop Dish Washer.
     * @throws NotStartedDishWasherException if Dish Washer has not been started.
     * Sets isStarted = false and hasCleanDishes = true.
     */
    public void stop() {
        if(!isStarted) {
            throw new NotStartedDishWasherException();
        }
        isStarted = false;
        hasCleanDishes = true;
    }

}
