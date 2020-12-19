package assignment1;

public class StackSet implements StackSet_Interface {
	private Node head;  //this will be the entry point to your linked list 
						//( it points to the first data cell, the top for a stack )
	private final int limit;  //defines the maximum size the stackset may contain
	private int size;   //current count of elements in the stackset 
	
	private Node curr;

	public StackSet( int maxNumElts ){ //this constructor is needed for testing purposes. 
		head = null;                 //Please don't modify what you see here!
		limit = maxNumElts;          //you may add fields if you need to
		size = 0;
		curr = null;
	}

	//implement all methods of the interface, and 
	//also include the getRoot method below that we made for testing purposes. 
	//Feel free to implement private helper methods!
	//you may add any fields you need to add to make it all work... 

	public Node getRoot(){ //leave this method as is, used by the grader to grab 
		return head;         //your data list easily.
	}


	@Override
	public boolean push(double elt) {
		Node top;
		Node pusher;
		
		if (head == null) {
			head = new NodeImpl(elt);
			size+=1;
			return true;
		}
		
		top = head;
		if (top.getValue() == elt) {
			return true;
		}
		
		for (int i=0; i<size(); i++) {
			Node pv = top;
			if (top.getNext() == null) {
				break;
			}
			top = top.getNext();
			if (top.getValue() == elt) {
				pv.setNext(top.getNext());
				top.setNext(head);
				head = top;
				return true; 
			}
		}
		
		if (size() == limit()) {
			return false;
		} else {
			pusher = new NodeImpl(elt);
			pusher.setNext(head);
			size+=1;
			head = pusher;
			return true;
			
		}
		
	}

	@Override
	public boolean pop() {
		if (head != null) {
			head = head.getNext();
			size-=1;
			return true;
		}
		return false;
	}

	@Override
	public double peek() {
		if (head != null) {
			return head.getValue();
		}
		return Double.NaN;
	}

	@Override
	public boolean contains(double elt) {
		curr = head;
		int count = 0;
		while (curr != null) {
			if (count <= size) {
				if (curr.getValue() == elt) {
					return true;
				}
				curr = curr.getNext();
				count++;
			}
		}
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int limit() {
		return limit;
	}

	@Override
	public boolean isEmpty() {
		
		if(head != null) {
			return false;
		}
		if (size() != 0) {
		return false;
	}
		return true;
	}

	@Override
	public boolean isFull() {
		if (size == limit) {
			return true;
		}
		return false;
	}

}
