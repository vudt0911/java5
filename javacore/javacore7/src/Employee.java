import java.text.DecimalFormat;
import java.util.Scanner;

public class Employee {

    private int employeeId, age;
    private String name, phoneNumber, mailAddress;
    protected int basicSalary, salary;

    public Employee(int employeeId, int age, String name, String phoneNumber, String mailAddress, int basicSalary,
            int salary) {
        this.employeeId = employeeId;
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mailAddress = mailAddress;
        this.basicSalary = basicSalary;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Nhập mã nhân viên: ");
        employeeId = sc.nextInt();
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = sc.nextInt();
        System.out.println("Nhập số điện thoại: ");
        phoneNumber = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập địa chỉ email: ");
        mailAddress = sc.nextLine();
        System.out.println("Nhập lương cơ bản: ");
        basicSalary = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + employeeId + " - Tên: " + name+ " - Tuổi: " + age + " - SDT: " + phoneNumber
                + " - Email: " + mailAddress + " - Lương cơ bản: " + basicSalary;
    }

    public void salary() {
    }

    // Định dạng số tiền theo mình mong muốn
    public static String formatMoney(long salary) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        // 100000->100,000.00
        return formatter.format(salary);
    }
}
