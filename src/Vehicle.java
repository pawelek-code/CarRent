import java.util.Objects;

public class Vehicle {

        private String brand;
        private String model;
        private String plates;
        private int prodYear;
        private int power;
        private int kmLimit;

        Vehicle()
        {

        }
        Vehicle(String brand, String model,String plates, int prodYear, int power, int kmLimit)
        {
            this.brand=brand;
            this.model=model;
            this.plates=plates;
            this.prodYear=prodYear;
            this.power=power;
            this.kmLimit=kmLimit;
        }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", plates='" + plates + '\'' +
                ", prodYear=" + prodYear +
                ", power=" + power +
                ", kmLimit=" + kmLimit +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getKmLimit() {
        return kmLimit;
    }

    public void setKmLimit(int kmLimit) {
        this.kmLimit = kmLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return prodYear == vehicle.prodYear && power == vehicle.power && kmLimit == vehicle.kmLimit && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model) && Objects.equals(plates, vehicle.plates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, plates, prodYear, power, kmLimit);
    }
}


