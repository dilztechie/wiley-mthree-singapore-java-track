public class MyThread extends Thread {
	private int startNumber;
	private int endNumber;
	private int increment;
	
	public MyThread(String name, int priority, int startNumber, int endNumber, int increment) {
		setName(name);
		setPriority(priority);
		this.startNumber = startNumber;
		this.endNumber = endNumber;
		this.increment = increment;
		start();
	}

	@Override
	public void run() {
		System.out.println("Begin of Child Thread: " + getName());
		try {
			for(int count = startNumber; count <= endNumber; count += increment) {
				System.out.println(getName() + " Counting: " + count);
				sleep(1000);
			}
		} catch(InterruptedException ie) {}
		System.out.println("End of Child Thread: " + getName());
	}
}