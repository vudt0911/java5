import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Boolean check = false; 

        while (!check) {
            System.out.println("Nhập email cần kiểm tra ");
            Scanner sc = new Scanner(System.in);
            String email = EmailCheck.Email(sc.nextLine());

            System.out.println(email);
        }

        
    }
}
