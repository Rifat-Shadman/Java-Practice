public class BMITest {
    public static void main(String[] args) {
        BMI bmi = new BMI("Rifat Shadman", 78, 68);
        System.out.println("The BMI for " + bmi.getName() + " is (" + bmi.getBMI() + ") " + bmi.getStatus());
    }
}
