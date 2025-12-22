import java.util.Scanner;

public class Student extends Person4{
    private int rollno;
    private int marks;

    @Override
    public void getdata(Scanner scan) {
        super.getdata(scan);
        System.out.print("Enter your rollno: ");
        rollno = this.scan.nextInt();
        System.out.print("Enter your marks: ");
        marks = this.scan.nextInt();
    }

    @Override
    public void display() {
        super.display(); // display title and price
        System.out.println("Roll no: " + rollno);
        System.out.println("Marks: " + marks);
    }

}
