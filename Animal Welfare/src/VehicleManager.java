import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
    private List<Vehicle> vehicles;

    public VehicleManager() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}

