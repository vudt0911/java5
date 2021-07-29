import java.util.Scanner;

public class App {

    public String chuanHoa(String str) {
        str = str.trim().toLowerCase();
        str = str.replaceAll("\\s+", " ");
        return str;
    }

    public String chuanHoaDanhTuRieng(String str) {
        str = chuanHoa(str);
        String temp[] = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) {
                str += " ";
            }
        }
        return str;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            System.out.println("Nhập chuỗi cần kiểm tra: ");
            String str = sc.nextLine();
            App chx = new App();
            str = chx.chuanHoaDanhTuRieng(str);
            System.out.println(str);
            Mneu();
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

    public static void Mneu() {
        System.out.println("Hãy nhập lựa chọn của bạn: ");
        System.out.println("1 - Tiếp tục chuẩn hóa chuổi nhập vào: ");
        System.out.println("2 - Thoát chương trình: ");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
