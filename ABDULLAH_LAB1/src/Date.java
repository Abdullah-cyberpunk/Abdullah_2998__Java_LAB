//Home task No 3
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void dispalydate(){
        System.out.println("Date: " + this.getDay() + "/" + this.getMonth() + "/" + this.getYear());
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;  // or any format you like
    }
    //Main method
    public static void main(String[] args) {
        long[] times = {
                10000L,
                100000L,
                1000000L,
                10000000L,
                100000000L,
                1000000000L,
                10000000000L,
                100000000000L
        };

        for (long t : times) {
            java.util.Date date = new java.util.Date(t); // create Date with elapsed time
            System.out.println("Elapsed time: " + t + " -> " + date.toString());
        }
    }

}
