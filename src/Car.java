// Klasa Car dziedzicząca po Vehicle
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
        return String.format("%s, Fuel Efficiency: %.2f miles/gallon", super.toString(), calculateFuelEfficiency());
    }
}