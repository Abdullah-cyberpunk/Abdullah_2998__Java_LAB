class More_Electricity extends Electricity {

    // Overriding the Bill method
    @Override
    public double Bill(int units) {

        double cost = super.Bill(units); // Get cost from parent class

        // If cost is more than 250, add 15% surcharge
        if (cost > 250) {
            double extra = (cost - 250) * 0.15; // 15% of extra amount
            cost = cost + extra;
        }

        return cost;
    }
}

