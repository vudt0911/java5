public class ElectronicDocument extends Book implements IDownload {

    long capacity, price;
    int downloadNumber;

    public ElectronicDocument(String id, String name, String publishingHouse, int publishedYear, long capacity,
            long price, int downloadNumber) {
        super(id, name, publishingHouse, publishedYear);
        this.capacity = capacity;
        this.price = price;
        this.downloadNumber = downloadNumber;
    }

    public ElectronicDocument() {
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getDownloadNumber() {
        return downloadNumber;
    }

    public void setDownloadNumber(int downloadNumber) {
        this.downloadNumber = downloadNumber;
    }

    public void input() {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + capacity + price + downloadNumber;
    }

    @Override
    public void totalMoney() {

    }

}
