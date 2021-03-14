public enum TypeOfMessage {

    NOTE("note"),
    REPOST("repost"),
    COMMENTARY("commentary");

    private final String type;

    TypeOfMessage(String type) {
        this.type = type;
    }

    public String getValue() {
        return type;
    }

}
