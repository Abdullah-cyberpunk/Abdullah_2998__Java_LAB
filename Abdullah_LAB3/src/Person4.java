import java.util.Scanner;
public class Person4 {
    private int id;
    private String name;
    private String address;


    Scanner scan = new Scanner(System.in);
    public void getdata(Scanner scan) {
        System.out.print("Enter your id: ");
        id = this.scan.nextInt();
        System.out.print("Enter your name: ");
        name = this.scan.next();
        System.out.println("Enter your Address");
        address = this.scan.next();
    }

    public void display() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("address: " + address);
    }
}


