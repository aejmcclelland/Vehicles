package Vehicle;

public class Vehicle {
	//public method
	String vehicleType;
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
    	this.fuelType = fuelType;
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
