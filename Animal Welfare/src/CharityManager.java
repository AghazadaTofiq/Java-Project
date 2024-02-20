import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public record CharityManager(Map<CharityType, List<Charity<?>>> charities) {

    public CharityManager {
        charities = new TreeMap<>();
        for (CharityType type : CharityType.values()) {
            charities.put(type, new ArrayList<>());
        }
    }

    public synchronized void addCharity(Charity<?> charity) {
        charities.computeIfAbsent(charity.getType(), k -> new ArrayList<>()).add(charity);
    }

    public List<Charity<?>> getCharitiesByType(CharityType type) {
        synchronized (charities) {
            return new ArrayList<>(charities.get(type));
        }
    }

    public List<String> listCharities() {
        synchronized (charities) {
            List<String> charityNames = new ArrayList<>();

            charities.forEach((type, list) ->
                    list.forEach(charity -> charityNames.add(type + " - " + charity.getWorks().get(0).getName())));

            return charityNames;
        }
    }
}
