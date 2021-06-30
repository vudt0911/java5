import java.util.Scanner;

public class CountCharacter {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = new String();
        System.out.println("Mời bạn nhập 1 chuỗi: ");
        str = sc.nextLine();
        System.out.println("--------------------------------");
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) == 'e'){
                count++;
                System.out.println("index của e là: " +str.indexOf('e', i));
            }
        }
        System.out.println("--------------------------------");
        System.out.printf("chuỗi \"%s\" có %d  ký tự 'e'.%n", str, count);

            // Scanner sc = new Scanner(System.in);
            // int count = 0;
            // String str = "Hello every one";
            // for (int i = 0; i < str.length(); i++){
            //     if (str.charAt(i) == 'e'){
            //         count++;
            //         System.out.println("index lần lượt của e là: " +str.indexOf('e', i));
            //     }
            // }
            // System.out.println("số lần lặp lại của e là: "+count);

    }
}