import java.util.Scanner;

public class Developer extends Employee {
    private int overtimeHours;

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public Developer(int employeeId, int age, String name, String phoneNumber, String mailAddress, int basicSalary,
            int salary, int overtimeHours) {
        super(employeeId, age, name, phoneNumber, mailAddress, basicSalary, salary);
        this.overtimeHours = overtimeHours;
    }

    public Developer() {
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    Scanner sc = new Scanner(System.in);

    public void input() {
        super.input();
        System.out.println("Nhập số giờ tăng ca: ");
        overtimeHours = sc.nextInt();
    }

    public void salary() {
        salary = basicSalary + overtimeHours * 200000;
    }

    @Override
    public String toString() {
        return super.toString() + " - Số giờ làm thêm: " + overtimeHours + " - Lương: " + salary;
    }

}
