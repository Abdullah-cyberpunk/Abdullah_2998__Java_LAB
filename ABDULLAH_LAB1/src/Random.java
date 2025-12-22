//Home task No 4
public class Random {
        public static void main(String[] args) {
            // Create Random object with seed 1000
            java.util.Random random = new java.util.Random(1000);

            //  display 50 random integers between 0 and 99
            for (int i = 0; i < 50; i++) {
                int number = random.nextInt(100);
                System.out.print(number + " ");
            }
        }
    }
