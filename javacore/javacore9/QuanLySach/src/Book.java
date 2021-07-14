public abstract class Book {

    private String id, name, publishingHouse;
    private int publishingYear;

    public Book(String id, String name, String publishingHouse, int publishedYear) {
        this.id = id;
        this.name = name;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
    }

    public Book() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishedYear() {
        return publishingYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishingYear = publishingYear;
    }

    public void input() {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Id Book: " + id + "Name Book: " + name + "publishing House: " + publishingHouse + "publishing Year: "
                + publishingYear;
    }

}