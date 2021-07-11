import java.text.DecimalFormat;

public class Product {

    String id, name, descrip, brand;
    long price;
    int amount, amountSale;
    Category category;

    public Product(String id, String name, String descrip, String brand, long price, int amount, int amountSale,
            Category category) {
        this.id = id;
        this.name = name;
        this.descrip = descrip;
        this.brand = brand;
        this.price = price;
        this.amount = amount;
        this.amountSale = amountSale;
        this.category = category;
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

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountSale() {
        return amountSale;
    }

    public void setAmountSale(int amountSale) {
        this.amountSale = amountSale;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Id: " + id + " - name: " + name + " -descrip: " + descrip + " -price: " + formatMoney(price)
                + " -amount: " + amount + " -amount Sale: " + amountSale + " -Brand: " + brand + " -Category: "
                + category.getValue();
    }

    // Định dạng số tiền theo mình mong muốn
    public static String formatMoney(long price) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        // 100000->100,000.00
        return formatter.format(price);

    }

}
