import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int rows, columnt;

        while (true) {
            try {
                System.out.println("nhap so hang: ");
                rows = Integer.valueOf(sc.nextLine());
                System.out.println("nhap so cot");
                columnt = Integer.valueOf(sc.nextLine());
                if (rows <= 0 || columnt <= 0) {
                    if (rows <= 0) {
                        System.out.println("So hang phai la 1 so duong ");
                    }
                    if (columnt <= 0) {
                        System.out.println("So cot phai la 1 so duong ");
                    }
                } else {
                    System.out.println("Hinh chu nhat ban vua nhap la: \n");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columnt; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("--------------------------------------------------");
                }

            } catch (NumberFormatException ex) {
                System.out.println("Hay nhap so ");
            }
        }

    }
}