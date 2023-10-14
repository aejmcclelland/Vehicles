package Vehicle;

public class FuelType {
	
	private static final FuelTypes[] validFuelTypes = FuelTypes.values();

	public static boolean isValidFuelType(String fuelType) {
        for (FuelTypes type : validFuelTypes) {
            if (type.name().equalsIgnoreCase(fuelType)) {
                return true;
            }
        }
        return false;
    }
}
