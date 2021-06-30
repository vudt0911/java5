import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        String a,b ="";                         
        Scanner sc = new Scanner(System.in);    
        System.out.println("Nhập 1 chuỗi bất kỳ cần kiểm tra Palindrome: ");
        a = sc.nextLine();                      
        int c = a.length();                     
        for (int i = c-1; i >= 0; i--){         
            b = b + a.charAt(i);                
        }
        if(a.equalsIgnoreCase(b)){  // eaqualsIgnoreCase không phân biệt chữ hoa và chũ thường, equals thì phân biệt
            System.out.println("Chuỗi bạn nhập là chuỗi Palindrome.");
        }else{
            System.out.println("Chuỗi bạn nhập không phải là chuỗi Palindrome.");
        }

    }
    
}
