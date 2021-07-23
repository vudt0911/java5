import java.text.DecimalFormat;

public class Product {

    private int id;
    private String name;
    private String productType;
    private int amount;
    private long price;
    private int amountSale;

    public Product(int id, String name, String string, int amount, long price, int amountSale) {
        this.id = id;
        this.name = name;
        this.productType = string;
        this.amount = amount;
        this.price = price;
        this.amountSale = amountSale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountSale() {
        return amountSale;
    }

    public void setAmountSale(int amountSale) {
        this.amountSale = amountSale;
    }

    @Override
    public String toString() {
        return "mã: " + id + ", tên sản phẩm: " + name + ", loại sản phẩm: " + productType + ", số lượng: " + amount
                + ", giá bán: " + formatMoney(price) + ", số lượng bán: " + amountSale;
    }

    // Định dạng số tiền theo mình mong muốn
    public static String formatMoney(long price) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        // 100000->100,000.00
        return formatter.format(price);

    }
}
