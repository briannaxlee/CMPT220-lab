package finalquestion;

public class Test
{
	public static void main(String[] args)
	{
		StopWatch stopWatch = new StopWatch();

		stopWatch.start();
		
		int[] randomArray = getArray();
		
		stopWatch.stop();

		System.out.println("The execution time of sorting 100,000 numbers is " 
		+ stopWatch.getElapsedTime() + " milliseconds");
	}

	public static int[] getArray()
	{
		int[] array = new int[100000];
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random() * 100000);
		}
		
		return array;
	}
}
