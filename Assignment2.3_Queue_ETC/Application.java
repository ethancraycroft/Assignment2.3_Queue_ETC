import java.util.*;

public class Application 
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		Queue<String> VegeBurger = new Queue<String>();
		int i = 1;
		while(i > 0)
		{
			System.out.println("Would you like to (1)add to the queue, (2)remove from the queue, or (3) close? Enter the correspoding number.");
			int decision = scan.nextInt();
			if(decision == 1)
			{
				System.out.print("Enter the name of the person you would like to add to the line: ");
				String name = scan.next();
				System.out.println("\nOkay, adding " + name + " to the queue.");
				VegeBurger.enqueue(name);
				System.out.println();
				System.out.println("The current queue: ");
				VegeBurger.printQueue();
				System.out.println();
				i++;
			}
			else if(decision == 2)
			{
				System.out.println("\nOkay, removing the first person from the line.");
				System.out.println(VegeBurger.dequeue() + " removed from queue.");
				System.out.println();
				System.out.println("The current queue: ");
				VegeBurger.printQueue();
				System.out.println();
				i++;
			}
			else if(decision == 3)
			{
				i = 0;
			}
			else
			{
				i++;
			}
		}	
		scan.close();
	}
}
