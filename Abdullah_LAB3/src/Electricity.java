class Electricity {

    // Method to calculate bill
    public double Bill(int units) {
        double cost;

        if (units <= 100) {
            cost = units * 0.50;     // 50 paisa per unit
        } else {
            // First 100 units → 50p
            // Remaining units → 60p
            cost = (100 * 0.50) + ((units - 100) * 0.60);
        }

        return cost;   // Return the calculated cost
    }
}