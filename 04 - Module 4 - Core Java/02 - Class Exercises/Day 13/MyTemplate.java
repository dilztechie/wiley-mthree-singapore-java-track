/*
 * Generic class
 * Here, T is a type parameter that
 * will be replaced by a real type
 * when an object of type MyTemplate is created
 */
public class MyTemplate<T> {
	T object; // declare object of type T
	
	public MyTemplate(T object) {
		this.object = object;
	}
	
	public T getObject() {
		return object;
	}
}