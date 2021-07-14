import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Team team = new Team();
        team.getAllPlayers();
        System.out.println("----------------------------------------------------------------");
        Menu menu = new Menu();
        System.out.println("Nhap lua chon cua ban: ");
        System.out.println("----------------------------------------------------------------");
        menu.chooseMenu();
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                team.input1();
                break;
            case 2:
                team.input2();
                break;
            case 3:
                team.input3();
                break;
            case 0:
                System.out.println("Chào tạm biệt");
                System.exit(0);
        }
    }
}
