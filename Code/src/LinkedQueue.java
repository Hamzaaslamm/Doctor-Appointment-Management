public class LinkedQueue<T> implements QueueInterface<T>{
	private Node first;
	private Node last;
	
	public LinkedQueue(){
		first = null;
		last = null;
	}
	
	@Override
	public void enqueue(T newEntry){
		Node newNode = new Node(newEntry);
		if(isEmpty()){
			first = newNode;
			last = newNode;
		}else{
			last.setNextNode(newNode);
			last = newNode;
		}//if-else		
	}//enqueue

	@Override
	public T dequeue(){
		if(isEmpty()){
			return null;
		}else{
			if(first == last){
				T temp = (T) first.getData();
				clear();
				return temp;
			}else { 
				T temmp = (T) first.getData();
				first = first.getNextNode();
				return temmp;
			}//if-else Inner
		}//if-else Outer
	}//dequeue

	@Override
	public boolean isEmpty(){
		return (first == null && last == null);
	}//isEmpty

	@Override
	public void clear(){
		first = null;
		last = null;
	}//clear

}//class