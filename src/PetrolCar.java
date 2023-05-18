public class PetrolCar extends Vehicle {
    private int engCapacity;
    private int fuelPrecent;

    public PetrolCar(String brand, String model, String plates, int prodYear, int power, int kmLimit, int engCapacity, int fuelPercent) {
        super(brand, model, plates, prodYear, power, kmLimit);
        this.engCapacity = engCapacity;
        this.fuelPrecent=fuelPercent;
    }
}
