package secondHomeWork;

public class Picture extends Media implements PrintableRecord {

    private int height;
    private int width;

    protected Picture(String author, String date, String message, TypeOfMessage typeOfMessage, int height, int width) {
        super(author, date, message, typeOfMessage, "firstHomeWork.Picture");
        this.height = height;
        this.width = width;
    }

    @Override
    double getMaxNoteSize() {
        return 0.5;
    }

    public String getDimensions() {
        return "Dimensions: " + height + "x" + width;
    }

    @Override
    public void print(String pathToFile) {
        //print picture
    }

}
