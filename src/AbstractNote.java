abstract public class AbstractNote {

    protected final String author;
    protected final String date;
    protected final String message;
    protected final String typeOfMessage;

    protected AbstractNote(String author, String date, String message, String typeOfMessage) {
        this.author = author;
        this.date = date;
        this.message = message;
        this.typeOfMessage = typeOfMessage;
    }

    void displayContent() {
        System.out.println("Author: " + author + "\nDate: " + date + "\nMessage: " + message + "\nType of message: " + typeOfMessage);
    }

    abstract double getMaxNoteSize();

}
