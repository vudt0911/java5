import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double height;
        double weight;
        double bmi1;

        while (true) {
            try {
                System.out.println("Hãy nhập chiều cao theo m: ");
                height = Double.valueOf(sc.nextLine());
                System.out.println("Hãy nhập cân nặng theo kg: ");
                weight = Double.valueOf(sc.nextLine());
                bmi1 = weight / Math.pow(height, 2);
                if (height <= 0 || weight <= 0) {
                    System.out.println("Chieu cao va can nang phai la 1 so duong, xin hay nhap lai");
                    // check = true;
                } else {
                    Person person = new Person();
                    person.show(bmi1);
                }

            } catch (NumberFormatException ex1) {
                System.out.println("Hay nhap so");
            }
        }
    }
}
