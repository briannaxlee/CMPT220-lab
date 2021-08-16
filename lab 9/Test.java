package lab9;

public class Test
{	
	public static void main(String[] args)
	{
		Circle circle1 = new Circle(15, "red", true);
		Circle circle2 = new Circle(10, "blue", false);

		System.out.println("Circle 1: ");
		System.out.println(circle1);
		System.out.println();

		System.out.println("Circle 2: ");
		System.out.println(circle2);
		System.out.println();

		System.out.println("The larger of the two circles was ");
		System.out.println(Circle.getMax(circle1, circle2));
		System.out.println();

		Rectangle rectangle1 = new Rectangle(4, 5, "green", true);
		Rectangle rectangle2 = new Rectangle(4.2, 5, "orange", true);

		System.out.println("Rectangle 1: ");
		System.out.println(rectangle1);
		System.out.println();

		System.out.println("Rectangle 2: ");
		System.out.println(rectangle2);
		System.out.println();

		System.out.println("The larger of the two rectangles was ");
		System.out.println(Rectangle.getMax(rectangle1, rectangle2));
	}
}