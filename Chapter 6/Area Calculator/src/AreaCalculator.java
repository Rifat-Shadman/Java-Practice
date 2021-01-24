public class AreaCalculator {
    public void getArea(double radius){
        System.out.println("The area of the circle is: " + Math.PI * radius * radius + " sq. units");
    }

    public void getArea(int length, int weidth){
        System.out.println("The area of the rectangle is: " + length * weidth + " sq. units");
    }

    public void getArea(int base, double height){
        System.out.println("The area of the triangle is: " + 0.5 * base * height + " sq. units");
    }

    public void getArea(double radius, double height){
        System.out.println("The area of the cylinder is: " + 2 * Math.PI * radius * (radius + height) + " sq. units");
    }
}
