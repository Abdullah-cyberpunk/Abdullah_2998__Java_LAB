//This is problem #3
public class Int {
    private int number;
    private int n;

    public Int (){
        number=0;
    }
    public Int(int n){
       number =n;
    }
    public void setZero(){
        number=0;
    }
    public void setNumber(int n){
        number=n;
    }

    public int getNumber() {
        return number;
    }
    public int getZero() {
        return number=0;
    }
// main method
    public static void main() {
Int number1= new Int();
    number1.setZero();
    number1.setNumber(69);
    System.out.println(number1.getNumber());
    System.out.println(number1.getZero());
}
}

