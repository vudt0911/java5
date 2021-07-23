import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SelectedProduct selectedProduct = new SelectedProduct();
        selectedProduct.getAllProducts();
        Menu menu = new Menu();
        menu.chooseMenu();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Nhập lựa chọn của bạn: ");
        int choose = sc.nextInt();
        System.out.println("----------------------------------------------------------------");

        switch (choose) {
            case 1:
                selectedProduct.show();
                break;

            case 2:
                selectedProduct.addProduct();
                break;
            case 3:
                selectedProduct.searchAndSetProduct();
                break;
            case 4:
                selectedProduct.searchAndDelete();
                break;
            case 5:
                selectedProduct.viewProducts();
                break;
            case 6:
                selectedProduct.viewAmountProduct();
                break;
            case 0:
                System.out.println("Chào tạm biệt");
                System.exit(0);
            default:
                System.out.println("Bạn đã nhập sai, hãy nhập lại");

        }
    }
}
