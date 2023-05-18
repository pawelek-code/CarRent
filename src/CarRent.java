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
}
