//This is problem #4
import java.util.Scanner;
public class Time {
 int hours;
 int minutes;
 int seconds;
// Using Scanner for User Input
public void readTime(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Hours");
    hours=sc.nextInt();
    System.out.println("Enter Minutes");
    minutes= sc.nextInt();
    System.out.println("Enter Seconds");
    seconds=sc.nextInt();
}
public void displayTime(){
    System.out.printf("%02d:%02d:%02d%n",hours,minutes,seconds);
}
public static void main(String[] args){
    Time t= new Time();
    t.readTime();
    t.displayTime();
}
}
