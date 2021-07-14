public class TextBook extends Book implements IBorrow, IContainer {

    private int pageNumber, totalAmount, amountBorrowed;
    private String state;

    public TextBook(String id, String name, String publishingHouse, int publishedYear, int pageNumber, int totalAmount,
            int amountBorrowed, String state) {
        super(id, name, publishingHouse, publishedYear);
        this.pageNumber = pageNumber;
        this.totalAmount = totalAmount;
        this.amountBorrowed = amountBorrowed;
        this.state = state;
    }

    public TextBook() {
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getAmountBorrowed() {
        return amountBorrowed;
    }

    public void setAmountBorrowed(int amountBorrowed) {
        this.amountBorrowed = amountBorrowed;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void input() {

    }

    @Override
    public String toString() {

        return super.toString() + pageNumber + totalAmount + amountBorrowed;
    }

    @Override
    public void location() {
        // TODO Auto-generated method stub

    }

    @Override
    public void instock() {
        // TODO Auto-generated method stub
        int instock = totalAmount - amountBorrowed;
    }
}
