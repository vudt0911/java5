import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SelectedProduct {
    Scanner sc = new Scanner(System.in);
    ArrayList<Product> allProducts = new ArrayList<Product>();

    public List<Product> getAllProducts() {
        allProducts.add(new Product(1, "Xoai", ProductType.FOOD.getValue(), 100, 250000, 70));
        allProducts.add(new Product(2, "Cam", ProductType.FOOD.getValue(), 200, 200000, 120));
        allProducts.add(new Product(3, "Táo", ProductType.FOOD.getValue(), 50, 230000, 20));
        allProducts.add(new Product(4, "Thìa", ProductType.HOUSEHOLD.getValue(), 110, 2100, 60));
        allProducts.add(new Product(5, "Chảo", ProductType.HOUSEHOLD.getValue(), 20, 270000, 11));
        allProducts.add(new Product(6, "Bát", ProductType.HOUSEHOLD.getValue(), 300, 2500, 210));
        allProducts.add(new Product(7, "Bông tẩy trang", ProductType.BEAUTYPRODUCT.getValue(), 30, 190000, 20));
        allProducts.add(new Product(8, "Kem chống nắng", ProductType.BEAUTYPRODUCT.getValue(), 120, 99000, 50));
        allProducts.add(new Product(9, "Váy", ProductType.FASHION.getValue(), 210, 320000, 67));
        allProducts.add(new Product(10, "Đầm", ProductType.FASHION.getValue(), 123, 350000, 76));

        return allProducts;
    }

    public void show() {
        for (Product product : allProducts) {
            System.out.println(product);
        }
    }

    public void addProduct() {
        System.out.println("Hãy nhập thông tin sản phẩm mới ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Số sản phẩm mới cần nhập: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("----------------------------------------------------------------");
            System.out.printf("Nhập thông tin sản phẩm thứ %d: ", (i + 1));
            System.out.println();
            System.out.println("Nhập mã sản phẩm: ");
            int id1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập tên sản phẩm: ");
            String name1 = sc.nextLine();
            System.out.println("Nhập loại sản phẩm: ");
            String productType1 = sc.nextLine();
            System.out.println("Nhập số lượng: ");
            int amount1 = sc.nextInt();
            System.out.println("Nhập giá bán: ");
            long price1 = sc.nextLong();
            System.out.println("Nhập số lượng bán được: ");
            int amountSale1 = sc.nextInt();
            allProducts.add(new Product(id1, name1, productType1, amount1, price1, amountSale1));
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Danh sách sản phẩm sau khi thêm là: ");
        for (Product product : allProducts) {
            System.out.println(product);
        }

    }

    public void searchAndSetProduct() {
        System.out.println("Nhập mã sản phẩm cần sửa: ");
        int id2 = sc.nextInt();
        int count = 0;

        for (int i = 0; i < allProducts.size(); i++) {

            if (allProducts.get(i).getId() == id2) {
                System.out.println("Thông tin sản phẩm cần tìm: ");
                System.out.println(allProducts.get(i).toString());
                count++;

                System.out.println("Nhập thông tin sản phẩm cần sửa: ");
                System.out.println("Nhập mã sản phẩm: ");
                int id1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập tên sản phẩm: ");
                String name1 = sc.nextLine();
                System.out.println("Nhập loại sản phẩm: ");
                String productType1 = sc.nextLine();
                System.out.println("Nhập số lượng: ");
                int amount1 = sc.nextInt();
                System.out.println("Nhập giá bán: ");
                long price1 = sc.nextLong();
                System.out.println("Nhập số lượng bán được: ");
                int amountSale1 = sc.nextInt();

                allProducts.set(i, new Product(id1, name1, productType1, amount1, price1, amountSale1));
                System.out.println("----------------------------------------------------------------");
                System.out.println("Thông tin sản phẩm sau khi sửa là: ");
                System.out.println(allProducts.get(i).toString());
                System.out.println("----------------------------------------------------------------");
                System.out.println("Danh sách sản phẩm sau khi sửa là: ");
                for (Product product : allProducts) {
                    System.out.println(product);
                }
                break;
            }
        }
        System.out.println((count == 0) ? "Không có mã sản phẩm này" : "");
    }

    public void searchAndDelete() {
        System.out.println("Nhập mã sản phẩm cần xóa: ");
        int id2 = sc.nextInt();
        int count = 0;

        for (int i = 0; i < allProducts.size(); i++) {

            if (allProducts.get(i).getId() == id2) {
                System.out.println("Thông tin sản phẩm cần tìm: ");
                System.out.println(allProducts.get(i).toString());
                count++;
                System.out.println("Bạn có chắc muốn xóa sản phẩm này không ? Nhập phím bất kỳ nếu muốn xóa");
                sc.nextLine();
                String input = sc.nextLine();
                if (input != "y") {
                    allProducts.remove(i);
                }
                System.out.println("----------------------------------------------------------------");
                System.out.println("Danh sách sản phẩm sau khi xóa là: ");
                for (Product product : allProducts) {
                    System.out.println(product);
                }
                break;

            }
        }
        System.out.println((count == 0) ? "Không có mã sản phẩm này" : "");
    }

    public void viewProducts() {
        Map<Integer, String> view = new HashMap<>();
        for (Product product : allProducts) {
            Integer id = product.getId();
            String value = "Sản phẩm: " + product.getName() + " - Số lượng bán được: " + product.getAmountSale();
            view.put(id, value);
        }

        for (Map.Entry<Integer, String> entry : view.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void viewAmountProduct() {
        Map<String, Integer> countProduct = new HashMap<>();
        for (Product product : allProducts) {
            if (!countProduct.containsKey(product.getProductType())) {
                countProduct.put(product.getProductType(), 1);
            } else {
                countProduct.put(product.getProductType(), countProduct.get(product.getProductType()) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : countProduct.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
