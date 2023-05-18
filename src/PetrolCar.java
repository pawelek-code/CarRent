import java.util.Objects;

public class PetrolCar extends Vehicle {
    private int engCapacity;
    private int fuelPrecent;

    public PetrolCar(String brand, String model, String plates, int prodYear, int power, int kmLimit, int engCapacity, int fuelPercent) {
        super(brand, model, plates, prodYear, power, kmLimit);
        this.engCapacity = engCapacity;
        this.fuelPrecent= fuelPercent;
    }
    PetrolCar()
    {

    }

    @Override
    public String toString() {
        return "PetrolCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", plates='" + plates + '\'' +
                ", prodYear=" + prodYear +
                ", power=" + power +
                ", kmLimit=" + kmLimit +
                ", engCapacity=" + engCapacity +
                ", fuelPrecent=" + fuelPrecent +
                '}';
    }

    public int getEngCapacity() {
        return engCapacity;
    }

    public void setEngCapacity(int engCapacity) {
        this.engCapacity = engCapacity;
    }

    public int getFuelPrecent() {
        return fuelPrecent;
    }

    public void setFuelPrecent(int fuelPrecent) {
        this.fuelPrecent = fuelPrecent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PetrolCar petrolCar = (PetrolCar) o;
        return engCapacity == petrolCar.engCapacity && fuelPrecent == petrolCar.fuelPrecent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engCapacity, fuelPrecent);
    }
}
