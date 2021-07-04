import java.util.Scanner;

public class stingArray{

    Scanner sc = new Scanner(System.in);

    public void createElement(String[] arr){

       for (int i = 0; i <arr.length; i++){
        System.out.println("Phần tử thứ "+i+" là: ");
        arr[i]=sc.nextLine();
       }
    }

    public void showElement(String[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public void countElement(String[] arr){
        int count=0;
        for(int i = 0; i <arr.length; i++){
            if(arr[i].toLowerCase().contains("java")){
                count++;
            }
        }
        System.out.println("Số lần java xuất hiện trong mảng là: " + count);
    }

    public void checkElement(String[] arr ){  
        System.out.println("Nhập chuổi bạn cần kiểm tra: ");
        String element = sc.nextLine();
        System.out.println("chuỗi bạn vừa nhập ở vị trí: ");
        for(int i = 0; i <arr.length; i++){
            if(element.equals(arr[i])){
                 System.out.print(i + "\t");
            }
            // else{
            //     System.out.println("chuỗi bạn nhập không có trong mảng");
            // }
        }
    }
    
}