import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        PersonModel<Student> students = new PersonModel<Student>();

        System.out.println("Nhap so luong sv can nhap: ");
        int number = sc.nextInt();
        sc.nextLine();
        // students.add(new Student("SV1", "Ngoc",20));
        // students.add(new Student("SV2", "Hoa",25));
        for (int i = 0; i < number; i++) {
            System.out.printf("nhap ma hs thu %d: ", (i + 1));
            String id1 = sc.nextLine();
            System.out.printf("nhap ten hs thu %d: ", (i + 1));
            String name1 = sc.nextLine();
            System.out.printf("nhap tuoi hs thu %d: ", (i + 1));
            int age1 = Integer.valueOf(sc.nextLine());
            students.add(new Student(id1, name1, age1));
        }

        System.out.println("danh sach SV la: ");
        students.display();

        System.out.println("----------------------------------------------------------------");
        PersonModel<Employee> employees = new PersonModel<Employee>();

        System.out.println("Nhap so luong nhan vien can nhap");
        int number2 = Integer.valueOf(sc.nextLine());

        for (int i = 0; i < number2; i++) {
            System.out.printf("Nhap ma nhan vien thu %d: ", (i + 1));
            String id2 = sc.nextLine();
            System.out.printf("Nhap ten nhan vien thu %d: ", (i + 1));
            String name2 = sc.nextLine();
            System.out.printf("Nhap luong nhan vien thu %d: ", (i + 1));
            long salary2 = Long.valueOf(sc.nextLine());
            employees.add(new Employee(id2, name2, salary2));
        }

        System.out.println("Danh sach nhan vien vua nhap la: ");
        employees.display();
    }
}
