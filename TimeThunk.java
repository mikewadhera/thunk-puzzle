
public class TimeThunk extends Thunk<String> {
	
	public TimeThunk() {
		super(new Computable<String>() {
			public String compute() {
				return "Current System Time: " + System.currentTimeMillis();
			}
		});
	}

}
