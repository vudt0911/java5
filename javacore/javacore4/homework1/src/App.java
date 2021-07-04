import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phân tử của mảng: ");
        int size = sc.nextInt();

        stingArray integerArray = new stingArray();
        String[] intArray = new String[size];
        integerArray.createElement(intArray); // tạo và nhập thông tin cho các phần tử

        System.out.println("Mảng vừa tạo là: ");
        integerArray.showElement(intArray); // in thông tin ra màn hình
        System.out.println();

        integerArray.countElement(intArray); // Số lần java xuất hiện trong mảng

        
        integerArray.checkElement(intArray); // Kiểm tra vị trí chuối vừa nhập
        System.out.println();
    }
}
