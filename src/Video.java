public class Video extends Media {

    private int length;

    protected Video(String author, String date, String message, String typeOfMessage, int length) {
        super(author, date, message, typeOfMessage, "Video");
        this.length = length;
    }

    @Override
    double getMaxNoteSize() {
        return 100.0;
    }

    public int getLength() {
        return length;
    }

    public void shortenVideo(int value) {
        if(length > value) {
            length -= value;
        } else {
            System.out.println("The value is greater than length of video");
        }
    }

}
