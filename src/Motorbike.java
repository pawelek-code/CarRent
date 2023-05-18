import java.util.Objects;

public class Motorbike extends Vehicle {
    private String type;

    public Motorbike(String brand, String model, String plates, int prodYear, int power, int kmLimit, String type) {
        super(brand, model, plates, prodYear, power, kmLimit);
        this.type = type;
    }
    Motorbike()
    {

    }

    @Override
    public String toString() {
        return "Motorbike{" +

                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", plates='" + plates + '\'' +
                ", prodYear=" + prodYear +
                ", power=" + power +
                ", kmLimit=" + kmLimit +
                ", type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorbike motorbike = (Motorbike) o;
        return Objects.equals(type, motorbike.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
