
public class ArrayStack implements Stack {
	protected Object array [] = new Object[10];
	protected int top = 0;
	
	@Override
	public void push(Object item) {
		if(top>array.length-1){
			grow();
		}
		array[top] = item;
		top++;
	}

	private void grow() {
		Object [] tempA = new Object[array.length*2];
		System.arraycopy(array,0, tempA, 0, array.length);
		array = tempA;
	}

	@Override
	public Object pop() {
		if(empty() == true){
			return null;
		}
		top--;
		return array[top];
	}

	@Override
	public Object peek() {
		if(empty() == true){
			return null;
		}
		return array[top-1];
	}

	@Override
	public boolean empty() {
		if(top==0){
			return true;
		}
		return false;
	}

}
