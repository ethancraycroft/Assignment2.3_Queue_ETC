
public class Queue<T>
{
	GenericLinkedList<T> queue = new GenericLinkedList<T>();
	public int count = 0;
	private GenericNode<T> front;
	private GenericNode<T> tail;
	
	public Queue()
	{
		front = null;
		tail = null;
	}
	public void enqueue(T input)
	{
		GenericNode<T> toAdd = new GenericNode<T>();
		toAdd.setData(input);
		queue.addNode(toAdd);
		if(count == 0)
		{
			front = toAdd;
		}
		else if(count > 0)
		{
			tail = toAdd;
		}
		count++;
	}
	
	public T dequeue()
	{
		count--;
		GenericNode<T> finishedNode = front;
		queue.removeNode();
		return finishedNode.getData();
	}
	
	public void printQueue()
	{
		GenericNode<T> temporaryStringNode = queue.getList();
		do
		{
			System.out.println(temporaryStringNode.getData());
			temporaryStringNode=temporaryStringNode.getNextNode();
		} 
		while (temporaryStringNode!=null);
	}
}
