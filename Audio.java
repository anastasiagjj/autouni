public class Audio extends Media {

    private final String genre;

    protected Audio(String author, String date, String message, String typeOfMessage, String genre) {
        super(author, date, message, typeOfMessage, "Audio");
        this.genre = genre;
    }

    @Override
    double getMaxNoteSize() {
        return 0.8;
    }

    public String getGenre() {
        return genre;
    }

}
