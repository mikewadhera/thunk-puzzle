
public class Thunk<T> implements Computable<T> {
	
	private Computable<T> computableDelegate;
	private T value;
	
	public Thunk(Computable<T> c) {
		this.computableDelegate = c;
	}
	
	synchronized public T get() {
		value = computableDelegate.compute(); 
		computableDelegate = this;
		return value;
	}
	
	public T compute() {
		return value;
	}
	
}
