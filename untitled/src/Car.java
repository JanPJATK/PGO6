class Car extends Vehicle {
    private double milesDriven;
    private double fuelConsumed;

    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesDriven / fuelConsumed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", milesDriven=" + milesDriven +
                ", fuelConsumed=" + fuelConsumed +
                ", fuelEfficiency=" + calculateFuelEfficiency() +
                '}';
    }
}