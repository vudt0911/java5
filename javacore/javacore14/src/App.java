import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);

        boolean check = false;

        while (!check) {
            Menu.mainMenu();
            int choose = Integer.valueOf(scanner.nextLine());
            switch (choose) {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("DANH SÁCH SẢN PHẨM");
                    repository.show();
                    break;

                case 2:
                    System.out.println("Các sản phẩm có giá trên 10000: ");
                    repository.filterProductByPrice();
                    break;

                case 3:
                    repository.countProductByAmountSale();
                    break;
                case 4:
                    System.out.println("Chọn loại sản phẩm bạn muốn hiển thị");
                    Menu.chooseCategory();
                    int chooseCategory = scanner.nextInt();
                    switch (chooseCategory) {
                        case 1:
                            System.out.println("Các loại thực phẩm");
                            repository.filterProductByFood();
                            break;
                        case 2:
                            System.out.println("Các loại thực phẩm");
                            repository.filterProductByHouseWare();
                            break;
                        case 3:
                            System.out.println("Các loại thực phẩm");
                            repository.filterProductByCosmetics();
                            break;
                        case 4:
                            System.out.println("Các loại thực phẩm");
                            repository.filterProductByFashion();
                            break;
                        default:
                            System.out.println("Bạn đã nhập sai, vui lòng nhập lại");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("San pham sap xep theo so luong san pham ban duoc: ");
                    repository.sortProductByAmountSale();
                    break;
                case 6:
                    System.out.println("San pham ban duoc nhieu nhat: ");
                    repository.filterProductByAmountSale();
                    break;
                case 7:
                    repository.sortProductByName();
                    System.out.println("Sản phẩm sau khi sắp xếp: ");
                    repository.show();
                    break;
            }
            System.out.println("------------------------------------------------------------------");
            System.out.println(
                    "Ban co muon thoat chuong trinh khong ? nhan 'y' de thoat chuong trinh va nhan phim bat ky de tiep tuc");
            String chooseNext = scanner.nextLine();
            if (chooseNext.equalsIgnoreCase("y")) {
                check = true;
            }
        }
    }
}