import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng động vật: ");
        int number = sc.nextInt();
    
        String[] nAnimal=new String[number];
        String[] cAnimal=new String[number];
        int[] lAnimal= new int[number];

        Animal animal = new Animal();

        animal.nameAnimal(nAnimal);  
        animal.colorAnimal(cAnimal); 
        animal.numberLegs(lAnimal); 

        System.out.println("Thông tin động vật là: ");
        System.out.println("--------------------------");
        animal.show(nAnimal, cAnimal, lAnimal);
        
        animal.searchAnimal(nAnimal, cAnimal, lAnimal);
        System.out.println();


       

        
        
    }
}
