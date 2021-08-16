package assignment8;

public class Test
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Queue queue = new Queue();

        for (int i = 0; i < 20; i++)
        {
            queue.enqueue(i + 1);
        }

        int queueSize = queue.getSize();
        
        System.out.println("Values in the queue are: ");
        for (int j = 0; j < queueSize; j++)
        {
            System.out.println("Value " + j + " is " + queue.dequeue());
        }
	}
}
