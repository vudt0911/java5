import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số nhân viên công ty: ");
        int number = sc.nextInt();
        Employee[] employees = new Employee[number];
        System.out.println("Nhập thông tin cho nhân viên: ");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập nhân viên thứ " + (i + 1) + ":");
            System.out.println();
            System.out.println("Chọn loại nhân viên: 1 - nếu là lập trình viên, 2 - nếu là kiểm chứng viên.");
            int choose = sc.nextInt();
            if (choose == 1) {
                employees[i] = new Developer();
            } else if (choose == 2) {
                employees[i] = new Tester();
            }
            employees[i].input();
            employees[i].salary();
        }

        System.out.println("Thông tin của nhân viên trong công ty: ");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.println(employees[i].toString());
        }
    }

}
