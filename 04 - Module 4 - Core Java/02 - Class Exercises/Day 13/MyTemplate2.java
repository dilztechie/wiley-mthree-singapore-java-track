public class MyTemplate2<T, V> {
	T object;
	V value;
	
	public MyTemplate2(T object, V value) {
		this.object = object;
		this.value = value;
	}
	
	public T getObject() {
		return object;
	}
	
	public V getValue() {
		return value;
	}
}