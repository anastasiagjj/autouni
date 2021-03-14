package thirdHomeWork;

public class CleanDishesInDishWasherException extends RuntimeException {

    CleanDishesInDishWasherException() {
        super("Dish Washer has clean dishes. You cannot start Dish Washer or put new dishes in it.");
    }

}
