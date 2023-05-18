import java.util.Objects;

public class ElectricCar extends Vehicle{
    private int batteryLvl;

    public ElectricCar(String brand, String model, String plates, int prodYear, int power, int kmLimit, int batteryLvl) {
        super(brand, model, plates, prodYear, power, kmLimit);
        this.batteryLvl = batteryLvl;
    }
    ElectricCar()
    {

    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLvl=" + batteryLvl +
                '}';
    }

    public int getBatteryLvl() {
        return batteryLvl;
    }

    public void setBatteryLvl(int batteryLvl) {
        this.batteryLvl = batteryLvl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricCar that = (ElectricCar) o;
        return batteryLvl == that.batteryLvl;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryLvl);
    }
}
