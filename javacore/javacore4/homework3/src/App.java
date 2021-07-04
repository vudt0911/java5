import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
         IntegerArray integerArray=new IntegerArray();
        
        System.out.println("Nhập số hàng và số cột: ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int A[][]=new int[n][m];

        System.out.println("Nhập các phần tử của mảng: ");
        integerArray.createArray(n,m, A);

        System.out.println("Mảng vừa nhập là: ");
        integerArray.show(n,m, A);
        System.out.println();

        System.out.println("Các phần tử nằm trên đường chéo chính là: ");
        integerArray.duongcheochinh(n,m, A); //theo google thì đường chéo chính của ma trận luôn ở vị trí A(i,j), với i=j;
        System.out.println();

    }
}
