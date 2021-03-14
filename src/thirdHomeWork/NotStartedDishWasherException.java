package thirdHomeWork;

public class NotStartedDishWasherException extends RuntimeException {

    NotStartedDishWasherException() {
        super("Dish washer has not been started");
    }

}
