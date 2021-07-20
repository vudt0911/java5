public class Person {
    public void show(double bmi) {
        System.out.println("------------------------------------");
        System.out.println("Chỉ số BMI của bạn là: " + bmi);
        if (bmi < 18.5) {
            System.out.println(" Bạn hơi gầy, hãy ăn nhiều thêm để có thân hình cân đối");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Bạn đang có thân hình cân đối, hãy phát huy nhé");
        } else if (bmi > 24.9) {
            System.out.println("Bạn đang thừa cân, hãy có chế độ ăn hợp lý để thân hình cân đối");
        }
    }
}
