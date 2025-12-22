
    class OvernightPackage extends Package {
        double extraFeePerOunce;

        OvernightPackage(double weight, double costPerOunce, double extraFeePerOunce) {
            super(weight,costPerOunce);
            this.extraFeePerOunce = (extraFeePerOunce > 0) ? extraFeePerOunce : 0;
        }

        @Override
        public double calculateCost(double weight , double costPerOunce) {

            return weight * (costPerOunce + extraFeePerOunce);
        }
    }


