package lab8;

public class BillfoldTester
{
	public static void main(String args[])
	{
		System.out.println("Testing polymorphic behavior of different cards..");
		System.out.println("");
		
		Billfold bf1 = new Billfold();
		Card idCard = new IDCard("Sam", "AP31");
		Card callingCard = new CallingCard("Bob", "909010", "CQ5852");
		
		bf1.addCard(idCard);
		bf1.addCard(callingCard);
		
		System.out.println(bf1.formatCards());
		System.out.println("");
		
		System.out.println("Adding a phone card and an expired driver license to test the "
				+ "expired cards count... It should be 1");
		System.out.println("");
		
		Billfold bf2 = new Billfold();
		Card callingCard2 = new CallingCard("Bob", "909010", "CQ5852");
		Card driverCard = new DriverLicense("Sam", "AP31", 2015);
		
		bf2.addCard(callingCard2);
		bf2.addCard(driverCard);
		
		System.out.println("Number of expired cards in billfold : " + bf2.getExpiredCardCount());
	}
}