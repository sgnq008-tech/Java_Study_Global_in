package genericex;

public class Box<T> {

	private T t;
	
	public void set(T t) {
		this.t=t;
	}
	
	
	public void add(T t) {
		
	}
	
	public T get() {
		return t;
	}
	
	public <U>void Print(U u){
		System.out.println("T : "+t.getClass().getName());
		System.out.println("T : "+t.getClass().getName());
		
	}
}
