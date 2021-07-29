import java.util.List;
import java.util.Scanner;

public class Constroller {
    String username;
    String password;

    Repository repository = new Repository();
    List<User> users = repository.getData();
    Scanner scanner = new Scanner(System.in);

    public void login() {
        // Thực hiện đăng nhập

        boolean check = false;
        while (!check) {
            System.out.println("Nhập tên đăng nhập: ");
            username = scanner.nextLine();

            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getUsername().equals(username)) {
                    System.out.println("Nhập mật khẩu: ");
                    password = scanner.nextLine();
                    if (users.get(i).getPassword().equals(password)) {
                        // thuc hien buoc dang nhap thanh cong
                        System.out.println("Chào mừng " + username + ", bạn có thể thực hiện các công việc sau:");
                        Menu.subMenu1();
                        int choose1 = Integer.parseInt(scanner.nextLine());
                        switch (choose1) {
                            case 1:
                                System.out.println("Thay đổi username");
                                String name1 = scanner.nextLine();
                                users.get(i).setUsername(name1);
                                System.out.println("Thông tin tài khoản thay đổi là: ");
                                System.out.println(users.get(i).toString());
                                repository.writeFile();
                                System.out.println("Mời bạn đăng nhập lại: ");
                                login();
                                break;
                            case 2:
                                System.out.println("Thay đổi email");
                                String email1 = scanner.nextLine();
                                users.get(i).setEmail(email1);
                                System.out.println("Thông tin tài khoản thay đổi là: ");
                                System.out.println(users.get(i).toString());
                                repository.writeFile();
                                System.out.println("Mời bạn đăng nhập lại: ");
                                login();
                                break;
                            case 3:
                                System.out.println("Thay đổi password");
                                String password1 = scanner.nextLine();
                                users.get(i).setPassword(password1);
                                System.out.println("Thông tin tài khoản thay đổi là: ");
                                System.out.println(users.get(i).toString());
                                repository.writeFile();
                                System.out.println("Mời bạn đăng nhập lại: ");
                                login();
                                break;
                            case 4:
                                System.out.println("Bạn đã đăng xuất, hãy nhập lại thông tin");
                                login();
                            case 0:
                                System.exit(0);
                        }
                    } else {
                        System.out.println("Bạn đã nhập mật khẩu sai ");
                        Menu.subMenu();
                        int choose = Integer.parseInt(scanner.nextLine());
                        switch (choose) {
                            case 1:
                                login();
                                break;
                            case 2:
                                forgotPassword();
                                break;
                        }
                    }
                } else {
                    System.out.println("Kiểm tra lại tên: " + username);
                    login();
                    break;
                }
            }

        }
    }

    public void forgotPassword() {
        // Quên mật khẩu
        System.out.println("Hãy nhập email của bạn: ");
        String email2 = scanner.nextLine();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(email2)) {
                System.out.println("Hãy nhập mật khẩu mới: ");
                String password3 = scanner.nextLine();
                users.get(i).setPassword(password3);
                System.out.println("Thông tin tài khoản thay đổi là: ");
                System.out.println(users.get(i).toString());
                repository.writeFile();
                System.out.println("Mời bạn đăng nhập lại: ");
                login();
                break;
            }
            System.out.println("Email này chưa tồn tại. ");
        }
    }

    public void createNewAccount() {
        // Tạo tài khoản mới
        boolean check = false;
        while (!check) {
            // int number = users.size();
            long id1 = IdGenerate.getNewID();
            System.out.println("Hãy nhập username: ");
            String username4 = scanner.nextLine();
            System.out.println("Hãy nhập email: ");
            String email4 = Validate.validateEmail(scanner.nextLine());
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getEmail().equals(email4)) {
                    System.out.println("Email đã tồn tại, hãy nhập lại: ");
                    createNewAccount();
                }
            }
            System.out.println("Hãy nhập password: ");
            String pass = Validate.validatePassword(scanner.nextLine());

            users.add(new User(id1, username4, email4, pass));
            // users.forEach(System.out::println);
            repository.writeFile();
            System.out.println("Thông tin tài khoản mới của bạn: ");
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId() == (id1 + 1)) {
                    System.out.println(users.get(i).toString());
                }
            }
            Menu.subMenu2();
            int subChoose = Integer.parseInt(scanner.nextLine());
            // check = true;
            switch (subChoose) {
                case 1:
                    login();
                    break;
                case 2:
                    check = true;
                    break;
            }
        }
    }
}
