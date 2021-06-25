import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Bài toán tìm cạnh huyền khi nhập 2 cạnh góc vuông vào");
        System.out.println("--------------------------");

        Scanner sc = new Scanner(System.in); //system.in =nhập thông tin từ bàn phím

        //Sử dụng các phương thức của lớp Scanner để nhập dữ liệu từ bàn phím
        System.out.println("Nhập cạnh góc vuông 1 ( nhập số nguyên): ");
        int a = sc.nextInt(); //Trả về dữ liệu kiểu int

        System.out.println("Nhập cạnh góc vuông 2 (nhập số nguyên): ");
        int b = sc.nextInt(); //Trả về dữ liệu kiểu int

        System.out.println("--------------------------");

        System.out.println("Cạnh góc vuông 1 : "+a);
        System.out.println("Cạnh góc vuông 2 : "+b);
        System.out.println("--------------------------");
        System.out.println("Chiều dài cạnh huyền là: " + Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));

    }

}