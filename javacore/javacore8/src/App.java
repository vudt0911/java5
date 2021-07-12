import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> listProducts = new ArrayList<Product>();
        // nhap thong tin san pham

        listProducts.add(
                new Product("OP01", "Oppo Reno5 8GB", "Oppo Reno5 8GB,128GB", "OPPO", 8390000, 10, 7, Category.PHONE));
        listProducts.add(new Product("OP02", "Oppo Reno4 Pro", "Oppo Reno4 Pro 8GB,128GB", "OPPO", 11490000, 25, 10,
                Category.PHONE));
        listProducts.add(
                new Product("OP03", "Oppo Reno3 8GB", "Oppo Reno3 8GB,128GB", "OPPO", 4390000, 11, 6, Category.PHONE));
        listProducts.add(new Product("SS01", "Samsung Galaxy Z Flip", "Samsung Galaxy Z Flip 16GB,512GB", "Samsung",
                20990000, 9, 3, Category.PHONE));
        listProducts.add(new Product("XO01", "Xiaomi Redmi 9", "Xiaomi Redmi 9 16GB,256GB", "XIAOMI", 3190000, 30, 25,
                Category.PHONE));
        listProducts.add(new Product("AS01", "Asus Zenbook UX325EA-EG079T", "May Tinh Asus Zenbook UX325EA-EG079T",
                "ASUS", 20790000, 10, 6, Category.LAPTOP));
        listProducts.add(new Product("DE01", "Dell G3 15 i5 10300H", "May tinh Dell G3 15 i5 10300H", "Dell", 21840000,
                15, 4, Category.LAPTOP));
        listProducts.add(
                new Product("MA01", "MacBook Air", "MacBook Air 2020 13'.", "APPLE", 33990000, 20, 4, Category.APPLE));
        listProducts.add(new Product("CO01", "Loa bluetooth Compact 2", "Loa bluetooth Compact 2, nghe sieu hay",
                "XIAOMI", 290000, 15, 3, Category.ACCESSORIES));

        // Hiển thị menu chọn
        System.out.println("Nhập số từ 0 - 3 để thực hiện hành động");
        System.out.println("----------------------------------------------------------------");
        Menu.choose();

        System.out.println("Hãy nhập số bạn cần thực hiện hành động");
        int number = Integer.valueOf(sc.nextLine());
        switch (number) {
            // In thông tin dựa trên danh mục
            case 1:
                System.out.println("----------------------------------------------------------------");
                System.out.println("Bạn đang trong phần DANH MỤC: ");
                System.out.println("----------------------------------------------------------------");
                Menu.chooseCategory();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Hãy nhập lựa chọn của bạn");
                int chooseCategory = sc.nextInt();
                switch (chooseCategory) {
                    case 1:
                        getListByCategory(listProducts, chooseCategory);
                        break;
                    case 2:
                        getListByCategory(listProducts, chooseCategory);
                        break;
                    case 3:
                        getListByCategory(listProducts, chooseCategory);
                        break;
                    case 4:
                        getListByCategory(listProducts, chooseCategory);
                        break;
                }
                break;
            // In thông tin sản phẩm dựa trên tìm tên hãng
            case 2:
                System.out.println("Nhập tên hãng bạn muốn tìm");
                String brand = sc.nextLine();
                getProductBrand(listProducts, brand);
                break;
            // In thông tin sản phẩm dựa trên mức giá và danh mục
            case 3:
                System.out.println("----------------------------------------------------------------");
                System.out.println("Bạn đang trong phần CHỌN MỨC GIÁ: ");
                System.out.println("----------------------------------------------------------------");
                Menu.choosePrice();
                System.out.println("----------------------------------------------------------------");
                System.out.println("Hãy nhập lựa chọn của bạn");
                int choosePrice = sc.nextInt();
                switch (choosePrice) {
                    case 1:
                        getProductPrice(listProducts, choosePrice);
                        break;
                    case 2:
                        getProductPrice(listProducts, choosePrice);
                        break;
                    case 3:
                        getProductPrice(listProducts, choosePrice);
                        break;
                    case 4:
                        getProductPrice(listProducts, choosePrice);
                        break;
                    case 5:
                        getProductPrice(listProducts, choosePrice);
                        break;
                }
                break;
            case 4:
                System.out.println("Nhập chuỗi cần tìm kiếm ");
                String search = sc.nextLine();
                getProductSearch(listProducts, search);
                break;

            // câu lệnh thoát khỏi chương trình
            case 0:
                System.out.println("Chào tạm biệt");
                System.exit(0);
        }

    }

    public static void getListByCategory(ArrayList<Product> list, int choose) {

        switch (choose) {
            case 1:
                System.out.println("DANH SÁCH ĐIỆN THOẠI: ");
                // ArrayList<Product> listProducts = new ArrayList<Product>(); dùng cái này là
                // cấpphátlại arraylist rồi nên mấy cái mình ađ vào lúc trước sẽ mất
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getCategory().toString().equals("PHONE")) {

                        System.out.println(list.get(i));
                    }
                }
                break;
            case 2:
                System.out.println("DANH SÁCH LAPTOP: ");
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getCategory().toString().equals("LAPTOP")) {

                        System.out.println(list.get(i));
                    }
                }
                break;
            case 3:
                System.out.println("DANH SÁCH APPLE: ");
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getCategory().toString().equals("APPLE")) {

                        System.out.println(list.get(i));
                    }
                }
                break;
            case 4:
                System.out.println("DANH SACH PHỤ KIỆN: ");
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getCategory().toString().equals("ACCESSORIES")) {

                        System.out.println(list.get(i));
                    }
                }
                break;
        }

    }

    public static void getProductBrand(ArrayList<Product> list, String brand) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBrand().equalsIgnoreCase(brand)) {
                System.out.println("Thông tin hãng bạn vừa nhập là ");
                System.out.println("----------------------------------------------------------------");
                System.out.println(list.get(i).toString());
                count++;
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println((count == 0) ? "Không có sản phẩm của hãng này" : "");
    }

    public static void getProductPrice(ArrayList<Product> list, int choosePrice) {
        int count = 0;

        switch (choosePrice) {
            case 1:
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getPrice() < 2000000) {
                        System.out.println(list.get(i).toString());
                        count++;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getPrice() >= 2000000 && list.get(i).getPrice() < 4000000) {
                        System.out.println(list.get(i).toString());
                        count++;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getPrice() >= 4000000 && list.get(i).getPrice() < 7000000) {
                        System.out.println(list.get(i).toString());
                        count++;
                    }
                }
                break;
            case 4:
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getPrice() > =7000000 && list.get(i).getPrice() < 13000000) {
                        System.out.println(list.get(i).toString());
                        count++;
                    }
                }
                break;
            case 5:
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getPrice() >= 13000000) {
                        System.out.println(list.get(i).toString());
                        count++;
                    }
                }
                break;
        }
        System.out.println((count == 0) ? "Không có sản phẩm này" : "");
    }

    public static void getProductSearch(ArrayList<Product> list, String search) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().contains(search)) {
                System.out.println(list.get(i).toString());
                count++;
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println((count == 0) ? "Không tìm thấy sản phẩm có từ khóa bạn nhập" : "");
    }

}
