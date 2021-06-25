import java.util.Scanner;
// import java.lang.Math;
// import java.lang.Double;


public class homework2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Tính chỉ số BMI");
        System.out.println("--------------------------");

        Scanner sc = new Scanner(System.in); 

        System.out.println("Nhập số cân nặng (tính theo kg): ");
        double a = sc.nextDouble(); 

        System.out.println("Nhập chiều cao (tính theo met): ");
        double b = sc.nextDouble(); 

        System.out.println("--------------------------");

        System.out.println("Cạnh góc vuông 1 : "+a);
        System.out.println("Cạnh góc vuông 2 : "+b);
        System.out.println("--------------------------");
        double c= a/(2*b);
        System.out.println("Chỉ số BMI là: " + c );
        
        System.out.println("--------------------------");

        // if (c < 18.5){
        //     system.out.println("Bạn đang gầy, cần ăn nhiều vô");
        // }else if ( (c>=18.5) && (c<=23) ) {
        //     system.out.println("Thân hình bạn đang cân đối, CHÚC MỪNG BẠN");
        // }else{
        //     system.out.println("Bạn đang hơi béo chút, cần giảm cân đi nhé :-)");
        // }
        
        String s = ((c>=18.5) && (c<=23) ) ? "Bạn có thân hình cân đối, xin CHÚC MỪNG BẠN" : "Thân hình bạn vẫn chưa đạt chuẩn, hãy điều chỉnh thêm để có thân hình cân đối nhé :-)";
        System.out.println(s);
    }

}