import java.util.ArrayList;
import java.util.List;

public class CarRent {
    private List<Vehicle> vehicles;

    CarRent() {
        vehicles = new ArrayList<>();
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
  public void addCar(Vehicle vehicle)
  {
      vehicles.add(vehicle);
  }
  public void rentaCar(Vehicle vehicle)
  {
      if (vehicle.availability == true) {
      vehicle.setAvailability(false);
      System.out.println("The car has been rented");
     }
  else{
      System.out.println("The car is not avaible");
  }
  }
    public void returnRentedCar(Vehicle vehicle){

        vehicle.setAvailability(true);
    }
  public void deleteCar(Vehicle vehicle){
    vehicle=null;
  }
    public void printAvaibleCars(){}
    public void printAllCarsFrom() {
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle.toString());
    }

    @Override
    public String toString() {
        return "CarRent{" +
                "vehicles=" + vehicles +
                '}';
    }
}
