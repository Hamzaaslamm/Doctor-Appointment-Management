public interface QueueInterface<T> {
	
	//Add element in list at current position
	public void enqueue(T newEntry);
	//Remove most earliest element
	public T dequeue();
	//Return true if list is empty, otherwise return false
	public boolean isEmpty();
	//Clear the list
	public void clear();
}
