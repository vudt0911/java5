import java.util.Scanner;

public class Animal {

    Scanner sc =new Scanner(System.in);
    
    public void nameAnimal(String[] name){
     for(int i=0; i<name.length; i++){
         System.out.println("Nhập tên động vật thứ "+i+": ");
         name[i] = sc.nextLine();
     }
    }

    public void colorAnimal(String[] color){
        for(int i=0; i<color.length; i++){
            System.out.println("Nhập màu sắc động vật "+i+": ");
            color[i] = sc.nextLine();
        }
    }

    public void numberLegs(int[] legs){
        for(int i=0; i<legs.length; i++){
            System.out.println("Nhập số chân động vật "+i+": ");
            legs[i] = sc.nextInt();
        }
    }

    public void show(String[] name, String[] color, int[] legs){
        for(int i=0; i<legs.length; i++){
            System.out.println("Con: "+name[i]+"\n"+"Màu: "+color[i]+"\n"+"Số chân: "+legs[i]);
            System.out.println("--------------------------");
        }
    }
        

   
    public void searchAnimal(String[] name,String[] color, int[] legs){
        for(int i=0; i<name.length; i++){
            String name1 = sc.nextLine();
            if(name1.toLowerCase().equals(name[i])){
                System.out.println("Con: "+name[i]+"\n"+"Màu: "+color[i]+"\n"+"Số chân: "+legs[i]);
            }
        }
    }
   
    
    
    }

  
