package Vehicle;

public class Main {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle();
		car.wheels=4;
		car.colour = "Red";
		car.vehicleType = "Car";
		car.setFuelType(FuelTypes.PETROL);
		
		Vehicle bicycle = new Vehicle();
		bicycle.wheels = 2;
		bicycle.colour = "Black";
		bicycle.vehicleType = "Road bike";
		bicycle.setFuelType(FuelTypes.LEG_POWERED);
		
		FuelTypes[] availableTypes = Vehicle.getAvailableFuelTypes();

		// Loop through available fuel types
		for (FuelTypes type : availableTypes) {
		    System.out.println("Types of fuel: " + type);
		}
		
		
		System.out.println(car);
		
		System.out.println(bicycle);

	}

}
