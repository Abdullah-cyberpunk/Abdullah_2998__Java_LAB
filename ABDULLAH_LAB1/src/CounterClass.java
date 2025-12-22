//        This is Problem #1

class CounterClass {
    static int num;

    CounterClass() {
        num++;
        System.out.println("Iam Object no" + num);
    }
    public static void main(String[] args) {
        CounterClass counterobject1 = new CounterClass();
        CounterClass counterobject2 = new CounterClass();
        CounterClass counterobject3 = new CounterClass();
    }
}
