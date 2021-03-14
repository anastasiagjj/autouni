package thirdHomeWork;

public class EmptyDishWasherException extends RuntimeException {

    EmptyDishWasherException() {
        super("Dish washer is empty");
    }

}
