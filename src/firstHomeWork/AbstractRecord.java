package firstHomeWork;

abstract public class AbstractRecord {

    protected final String author;
    protected final String date;
    protected final String message;
    protected final TypeOfMessage typeOfMessage;

    protected AbstractRecord(String author, String date, String message, TypeOfMessage typeOfMessage) {
        this.author = author;
        this.date = date;
        this.message = message;
        this.typeOfMessage = typeOfMessage;
    }

    void displayContent() {
        System.out.println("Author: " + author + "\nDate: " + date + "\nMessage: " + message + "\nType of message: " + typeOfMessage.getValue());
    }

    abstract double getMaxNoteSize();

}
