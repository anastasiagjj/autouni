package secondHomeWork;

public class TextNote extends AbstractRecord implements PrintableRecord {

    private int fontSize;

    public TextNote(String author, String date, String message, TypeOfMessage typeOfMessage, int fontSize) {
        super(author, date, message, typeOfMessage);
        this.fontSize = fontSize;
    }

    @Override
    double getMaxNoteSize() {
        return 2.205;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void changeFontSize(int size) {
        this.fontSize = size;
    }

    @Override
    public void print(String pathToFile) {
        //print text note
    }

}
