package Vehicle;

import java.util.Arrays;

public class Vehicle {
	//public method
	String vehicleType;
	String make;
    String colour;
    int wheels;
    FuelTypes fuelType;
    
    private static FuelTypes[] availableFuelTypes = FuelTypes.values();

    public static FuelTypes[] getAvailableFuelTypes() {
        return availableFuelTypes;
    }
    
    public static void listAvailableFuelTypes() {
	    for (FuelTypes type : availableFuelTypes) {
	        System.out.println(type);
	    }
	}
    
    public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    public FuelTypes getFuelType() {
    	return fuelType;
    }
    
    public void setFuelType(FuelTypes fuelType) {
    	// Check if the provided fuelType is valid
        if (isValidFuelType(fuelType)) {
            this.fuelType = fuelType;
        } else {
            // Handle invalid fuel type, e.g., throw an exception, set to a default, or print an error message
            System.out.println("Invalid fuel type. Please choose from the valid fuel types.");
        }
    }
    
    public static boolean isValidFuelType(FuelTypes fuelType) {
        // Check if the provided fuelType is in the list of valid fuel types
        return Arrays.asList(FuelTypes.values()).contains(fuelType);
    }
    
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    } 

    public void Show() {
    	
    }
    @Override
    public String toString() {
        return colour + " " + vehicleType + " has " + wheels + " wheels" + " and uses " + fuelType;
    }   
 

}
