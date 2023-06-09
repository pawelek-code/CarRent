import java.util.Objects;

public abstract class Vehicle {
        public boolean availability;
        protected String brand;
        protected String model;
        protected String plates;
        protected int prodYear;
        protected int power;
        protected int kmLimit;

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
            availability=true;
        }

    public void setAvailability(boolean availability) {
        this.availability = availability;
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


