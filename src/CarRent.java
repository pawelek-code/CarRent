import java.util.ArrayList;
import java.util.List;

public class CarRent {
    private List<Vehicle> vehicles;

    CarRent() {
        vehicles = new ArrayList<>();
    }
  public void addCar(Vehicle vehicle)
  {
      vehicles.add(vehicle);
  }
  public void rentaCar(Vehicle vehicle)
  {
      vehicle.setAvailability(false);
  }
  public void deleteCar(Vehicle vehicle)
  {
      vehicle.brand=null;
      vehicle.model=null;
      vehicle.plates=null;
      vehicle.prodYear=0;
      vehicle.power=0;
      vehicle.kmLimit=0;
  }
}
