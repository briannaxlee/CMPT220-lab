package lab8;

public class Billfold
{
	private Card card1;
	private Card card2;
	
	public void addCard(Card c) // subclass step 4
	{
		if (card1 == null)
		{
			card1 = c;
		}
		else if (card2 == null)
		{
			card2 = c;
		}
	}
	
	public String formatCards() // subclass step 4
	{
		return "[" + card1.format() + " | " + card2.format() + "]";
	}
	
	public int getExpiredCardCount() // step 10
	{
		int count = 0;
		if(card1.isExpired()) count++;
		if(card2.isExpired()) count++;
		return count;
	}

}
