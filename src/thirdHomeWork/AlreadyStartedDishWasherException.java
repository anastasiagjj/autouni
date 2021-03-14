package thirdHomeWork;

public class AlreadyStartedDishWasherException extends RuntimeException {

    AlreadyStartedDishWasherException() {
        super("Dish washer has been already started. You cannot put dishes in it or start it again.");
    }

}
