import java.util.Scanner;

public class IntegerArray {
    
    Scanner sc = new Scanner(System.in);

    public void createArray(int n,int m, int[][] arr) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.println("Nhập phần tử "+i+" + "+j+": ");
            arr[i][j] = sc.nextInt();
            
            }
        }
    }
    public void show(int n,int m, int[][] arr) {
        for(int i=0; i<n; i++) {
            System.out.println("");
            for(int j=0; j<m; j++){
                 System.out.print(arr[i][j]+"\t");
            }
           
        }
    }

    public void duongcheochinh(int n,int m, int[][] arr){
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++){
                if(i==j){
                    System.out.print(arr[i][j]+"\t");
                }
            }
        }
    }

}
