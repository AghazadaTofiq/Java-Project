import java.util.ArrayList;
import java.util.List;

public class LocationManager {
    private List<Location> locations;

    public LocationManager() {
        this.locations = new ArrayList<>();
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public List<Location> getLocations() {
        return locations;
    }
}
