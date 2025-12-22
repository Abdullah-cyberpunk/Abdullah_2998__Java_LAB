import java.util.Scanner;

public class Student1 {
    private int rollno;
    private String name;

    Scanner scan = new Scanner(System.in);
    public void getdata() {
        System.out.print("Enter your rollno: ");
        rollno = this.scan.nextInt();
        System.out.print("Enter your name: ");
        name = this.scan.next();
    }


    public void display() {
        System.out.println("Roll no: " + rollno);
        System.out.println("Name: " + name);
    }

}
