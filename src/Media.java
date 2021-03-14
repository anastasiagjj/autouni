abstract public class Media extends AbstractNote {

    protected final String mediaType;

    protected Media(String author, String date, String message, String typeOfMessage, String mediaType) {
        super(author, date, message, typeOfMessage);
        this.mediaType = mediaType;
    }

    public String getMediaType() {
        return mediaType;
    }

}
