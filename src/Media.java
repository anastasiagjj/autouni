abstract public class Media extends AbstractRecord {

    protected final String mediaType;

    protected Media(String author, String date, String message, TypeOfMessage typeOfMessage, String mediaType) {
        super(author, date, message, typeOfMessage);
        this.mediaType = mediaType;
    }

    public String getMediaType() {
        return mediaType;
    }

}
