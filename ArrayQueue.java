
public class ArrayQueue implements Queue {
	protected Object array[] = new Object[10];
	int head=0;
	int tail =0;

	@Override
	public Object dequeue() {
		if(empty() == true){
			return null;
		}
		return array[head++];
	}

	@Override
	public void enqueue(Object item) {
		if(tail==array.length){
			grow();
			array[tail++]=item;
		}
		else{
			array[tail++]=item;
		}
		
	}

	private void grow(){
		Object [] tempA = new Object[array.length*2];
		System.arraycopy(array,0, tempA, 0, array.length);
		array = tempA;
	}

	@Override
	public boolean empty() {
		if(head==tail){
			return true;
		}
		return false;
	}

}
