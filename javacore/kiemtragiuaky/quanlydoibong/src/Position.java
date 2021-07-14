
public enum Position {
    GK("Thu Mon"), DF("Hau Ve"), MF("Tien Ve"), FW("Tien Dao");

    private String value;

    private Position(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
