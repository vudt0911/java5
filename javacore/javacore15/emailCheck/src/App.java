import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Boolean check = false;

        while (!check) {
            System.out.println("Nhập email cần kiểm tra ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            EmailCheck.Email(email);
            Menu();
            int choose = Integer.valueOf(sc.nextLine());
            switch (choose) {
                case 1:
                    check = false;
                    break;
                case 2:
                    check = true;
                    break;
            }
        }
    }

    public static void Menu() {
        System.out.println("Nhập lựa chọn: ");
        System.out.println("1 - Tiếp tục kiểm tra email: ");
        System.out.println("2 - Thoát chương trình: ");
        System.out.println("Lựa chọn của bạn: ");
    }
}