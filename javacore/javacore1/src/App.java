public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, cô giáo Lục Thanh Ngọc");
        System.out.println("Bài tập 1, Nhân 2 số 50 *20");

        calculator calcu = new calculator();
        System.out.println(calcu.multiply());

        System.out.println("----------------");

        System.out.println("Bài tập 2, giới thiệu bản thân: tên, tuổi, địa chỉ");

        String str = "Đinh Thế Vũ";
        String str1 = "Hà Nội";
        age agename = new age();

        System.out.println("Tôi tên là " + str);
        System.out.println("Tuổi " + agename.getAge());
        System.out.println("Địa chỉ " + str1);

    }
}
