public class Thesis extends Book implements IContainer {

    private int pageNumber;
    private String state, protectedYear;

    public Thesis(String id, String name, String publishingHouse, int publishedYear, int pateNumber, String state,
            String protectedYear) {
        super(id, name, publishingHouse, publishedYear);
        this.pageNumber = pateNumber;
        this.state = state;
        this.protectedYear = protectedYear;
    }

    public Thesis() {
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPateNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProtectedYear() {
        return protectedYear;
    }

    public void setProtectedYear(String protectedYear) {
        this.protectedYear = protectedYear;
    }

    public void input() {

    }

    @Override
    public String toString() {

        return super.toString() + pageNumber;
    }

    @Override
    public void location() {

    }

}
