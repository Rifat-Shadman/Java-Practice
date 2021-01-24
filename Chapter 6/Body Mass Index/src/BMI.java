public class BMI {
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    private String name;
    private double weight;
    private double height;

    public BMI(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI(){
        height *= METERS_PER_INCH;
        return  (weight)/(Math.pow(height, 2));
    }

    public String getStatus(){
        double bmi = getBMI();

        if(bmi <18.5) return "Underweight";
        else if(bmi<25) return "Healthy";
        else return "Overweight";
    }

    public String getName(){
        return name;
    }
}
