package examples;

public class Vehicle {
	
	private String color;
	private String model;
	private String make;
	private int year;
	private boolean isNew;
	// if true, that implies that this vehicle is new
	private String typeOfvehicle;
	private int price;
	private boolean isAutomatic;
	// if true, that implies that this vehicle is automatic
	private int miles;
	private double mpg;
	
	private VehicleReview review;
	
	public Vehicle(String color, String model, String make, int year) {
		super();
		this.color = color;
		this.model = model;
		this.make = make;
		this.year = year;
	}

	public Vehicle(String color, String model, String make, int year, int price, boolean isAutomatic) {
		super();
		this.color = color;
		this.model = model;
		this.make = make;
		this.year = year;
		this.price = price;
		this.isAutomatic = isAutomatic;
	}

	public Vehicle(String color, String model, String make, int year, boolean isNew, String typeOfvehicle, int price,
			boolean isAutomatic, int miles, double mpg) {
		super();
		this.color = color;
		this.model = model;
		this.make = make;
		this.year = year;
		this.isNew = isNew;
		this.typeOfvehicle = typeOfvehicle;
		this.price = price;
		this.isAutomatic = isAutomatic;
		this.miles = miles;
		this.mpg = mpg;
	}

	public int getPrice() {
		return price;
	}

	public String getMake() {
		return make;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setReview(VehicleReview r) {
		review = r;
		// could have this.review = r; or the one above
	}
	
}
