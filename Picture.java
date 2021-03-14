public class Picture extends Media {

    private int height;
    private int width;

    protected Picture(String author, String date, String message, String typeOfMessage, int height, int width) {
        super(author, date, message, typeOfMessage, "Picture");
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

}
