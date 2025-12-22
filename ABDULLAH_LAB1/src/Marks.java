//this is problem #5
import java.util.Scanner;
public class Marks {
    int mark1, mark2, mark3;
// I use Scanner To grt User Input
    public void setMarks(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter 1st mark");
        mark1= scan.nextInt();
        System.out.println("Enter 2nd Mark");
        mark2= scan.nextInt();
        System.out.println("Enter 3rd Mark");
        mark3= scan.nextInt();
    }
    public int Sum(){
        return mark1+mark2+mark3;
    }
    public int Average(){
        return Sum()/3;
    }
public static void main (){
        Marks student1= new Marks();
        student1.setMarks();
    System.out.println("Sum of Marks is: "+ student1.Sum());
    System.out.println("Average is :"+student1.Average());
}
}
