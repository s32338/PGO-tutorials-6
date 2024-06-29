// Klasa abstrakcyjna Vehicle
abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Metoda abstrakcyjna do obliczania efektywności paliwowej
    public abstract double calculateFuelEfficiency();

    // Metoda toString do wyświetlania informacji o pojeździe
    @Override
    public String toString() {
        return String.format("%s %s (%d)", make, model, year);
    }
}

