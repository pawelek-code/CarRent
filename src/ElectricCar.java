public class ElectricCar extends Vehicle{
    private int batteryLvl;

    public ElectricCar(String brand, String model, String plates, int prodYear, int power, int kmLimit, int batteryLvl) {
        super(brand, model, plates, prodYear, power, kmLimit);
        this.batteryLvl = batteryLvl;
    }
}
