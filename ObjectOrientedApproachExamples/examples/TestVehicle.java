package examples;

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle lexus2020 = new Vehicle("Silver", "GS300", "Lexus", 2020);
		Vehicle toyotaRav4 = new Vehicle("Blue", "RAV4", "Toyota", 2020);
		
		//lexus2020.price = 20000;
		
		lexus2020.setPrice(40000);
		toyotaRav4.setPrice(25000);
		
		Date now = new Date();
		VehicleReview lexus2020review = new VehicleReview("John Doe", reviewDate, lexus2020);

		lexus2020.setReview(lexus2020review);
		
		System.out.println("Car Make: " + lexus2020.getMake() + ""
		
	}
}