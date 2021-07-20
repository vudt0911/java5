import java.text.DecimalFormat;

public class Employee {

    private String id, name;
    private long salary;

    public Employee(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        
        return id + "-" + name + "-" + formatMoney(salary);
    }

    // Định dạng số tiền theo mình mong muốn
    public static String formatMoney(long salary) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        // 100000->100,000.00
        return formatter.format(salary);

    }
}
