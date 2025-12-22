//        This is Problem #2
class CounterClass2 {
    // I make both of The States Private so only class can access them.
     static int num;
    static int count;
    CounterClass2() {
        num++;
        System.out.println("Iam Object no" + num);
    }
    // I create a public but static Getter method that returns an integer
    public static int getTotalObjects(){
    count=num;
    return count;
    }
//  testing in Main Method
    public static void main(String[] args) {
        CounterClass2 object1 = new CounterClass2();
        CounterClass2 object2 = new CounterClass2();
        CounterClass2 object3 = new CounterClass2();
        CounterClass2 object4 = new CounterClass2();

        System.out.println("Total no of Objects are :"+CounterClass2.getTotalObjects());
    }
}
