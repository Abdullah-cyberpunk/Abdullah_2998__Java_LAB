//Home task No 1
public class Rectangle {
    private double width = 1;
    private double height = 1;

    public Rectangle(){}

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        double Area = width * height;
        System.out.println("The Area of the Rectangle is: " + Area);
        return Area;
    }

    public double getPerimeter(){
        double Perimeter = 2 * (width + height);
        System.out.println("The Perimeter of the Rectangle is: " + Perimeter);
        return Perimeter;
    }
    //testing code in main method
    public static void main(String[] args) {
        System.out.println("Home task No 1");
        Rectangle rectangle1 = new Rectangle(10, 50);
        rectangle1.getArea();
        rectangle1.getPerimeter();

        Rectangle rectangle2 = new Rectangle(6.7, 12.9);
        rectangle2.getArea();
        rectangle2.getPerimeter();
        System.out.println("\n");
    }
}


