public class Menu {

    public static void choose() {
        System.out.println("1-Hiển thị thông tin dựa theo danh mục");
        System.out.println("2-Tìm kiếm thông tin các sản phẩm dựa theo hãng");
        System.out.println("3-Tìm kiếm thông tin sản phẩm dựa trên mức giá và danh mục");
        System.out.println("4-Tìm kiếm thông tin sản phẩm dựa trên nhập vào một chuỗi bất kỳ");
        System.out.println("0-Thoát");
    }

    public static void chooseCategory() {
        System.out.println("Lựa chọn theo danh mục");
        System.out.println("1-Điện thoại");
        System.out.println("2-Laptop");
        System.out.println("3-Apple");
        System.out.println("4-Phụ kiện");
    }

    public static void choosePrice() {
        System.out.println("Chọn mức giá");
        System.out.println("1: Dưới 2 triệu");
        System.out.println("2: từ 2 - 4 triệu");
        System.out.println("3: từ 4-7 triệu");
        System.out.println("4: từ 7 - 13 triệu");
        System.out.println("5: trên 13 triệu");
    }

}
