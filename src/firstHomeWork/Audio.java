package firstHomeWork;

public class Audio extends Media implements PlayableRecord {

    private final String genre;

    protected Audio(String author, String date, String message, TypeOfMessage typeOfMessage, String genre) {
        super(author, date, message, typeOfMessage, "firstHomeWork.Audio");
        this.genre = genre;
    }

    @Override
    double getMaxNoteSize() {
        return 0.8;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void play() {
        //play audio
    }
}
