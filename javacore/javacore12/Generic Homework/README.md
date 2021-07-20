1, Tạo class tên Student có các thuộc tính như id, name, age. Viết các
phương thức constructor, setter, getter, toString.
2, Tạo class tên Employee có các thuộc tính như id, name, salary. Viết các
phương thức constructor, setter, getter, toString.public class PersonModel<T> {
private ArrayList<T> al = new ArrayList<T>();
public void add(T obj) {
al.add(obj);
}
public void display() {
for (T object : al) {
System.out.println(object);
}
}
}
Tạo class PersonModel và thực hiện các công việc sau:Tạo đối tượng PersonModel<Student>
 Gọi phương thức add để nhập vào 2 sinh viên
 Gọi phương thức display để hiển thị thông tin của 2 sinh viên
vừa nhập
Tạo đối tượng PersonModel<Employee>
 Gọi phương thức add để nhập vào 2 nhân viên
 Gọi phương thức display để hiển thị thông tin của 2 nhân viên
vừa nhập
