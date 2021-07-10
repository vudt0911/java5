public class Tester extends Employee {

    private int errorDetector;

    public Tester(int employeeId, int age, String name, String phoneNumber, String mailAddress, int basicSalary,
            int salary, int errorDetector) {
        super(employeeId, age, name, phoneNumber, mailAddress, basicSalary, salary);
        this.errorDetector = errorDetector;
    }

    public Tester() {
    }

    public int getErrorDetector() {
        return errorDetector;
    }

    public void setErrorDetector(int errorDetector) {
        this.errorDetector = errorDetector;
    }

    public void input() {
        super.input();
        System.out.println("Nhập số lỗi phát hiện được: ");
        errorDetector = sc.nextInt();
    }

    public void salary() {
        salary = basicSalary + errorDetector * 50000;
    }

    @Override
    public String toString() {
        return super.toString() + " - Số lỗi phát hiện được: " + errorDetector + " - Lương: " + formatMoney(salary);
    }

}
