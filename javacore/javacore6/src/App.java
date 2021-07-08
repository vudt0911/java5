import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Trịnh Công Mạnh", 25, "Băc Giang"));
        students.add(new Student("Mai Duy Hưng Thành", 26, "Thái Bình"));
        students.add(new Student("Trần Thị Thu Hoa", 28, "Hà Nội"));
        students.add(new Student("Trịnh Anh Cương", 24, "Hà Giang"));
        students.add(new Student("Đinh Thế Vũ", 29, "Hà Nội"));
        students.add(new Student("Nguyễn Hòa Khiêm", 23, "Hà Nội"));
        students.add(new Student("Đào Ngọc Tùng", 26, "Hà Nội"));
        students.add(new Student("Vũ Minh Chính", 23, "Hà Nội"));
        students.add(new Student("Mai Văn Phán", 25, "Hòa Bình"));
        students.add(new Student("Lê Vũ Anh", 30, "Nam Định"));
        students.add(new Student("Nguyễn Tuấn Sơn", 25, "Hải Dương"));

        System.out.println("Danh sách học viên lớp Java5");
        System.out.println("--------------------------");
        for (Student s : students) {
            System.out.println(s);
        }

    }

}
