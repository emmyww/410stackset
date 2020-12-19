package assignment1;

public class StackSetPlayground {
	private StackSet set;
	private Node head;
	private final int limit;
	private int size;
	
	public StackSetPlayground(StackSet set, Node head, int limit, int size) {
		this.set = set;
		this.head = head;
		this.limit = limit;
		this.size = size;
	}
	@Override
	public String toString() {
		return set + "";
	}

	  public static void main(String[] args) { 
	    /*
	     here you can instantiate your StackSet and play around with it to check correctness. 
	     We've graciously also provided you a bit of extra test data for debugging.
	     It doesn't matter what you have in here. We will not grade it. 
	     This is for your use in testing your implementation.
	    */
	    StackSet set = new StackSet(3);
	    System.out.println(set);
	    set.push(1);
	    set.push(2);
	    System.out.println(set);
	    set.push(1);
	    System.out.println(set);
	    System.out.println(set.pop());
	    set.push(1);
	    set.push(2);
	    set.push(3);
	    System.out.println(set);
	    set.push(4);
	    System.out.println(set);
	  }
	 
	  
	  
	  
}


