public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test instanceof Test);
		test = null;
		System.out.println(test instanceof Test);
		System.out.println();
		
		Parent parent = new Parent();
		Child child1 = new Child();
		
		System.out.println(parent instanceof Parent);
		System.out.println(child1 instanceof Child);
		System.out.println(parent instanceof Child);
		System.out.println(child1 instanceof Parent);
		System.out.println();
		
		Child child2 = child1;
		System.out.println(child1 instanceof Child);
		System.out.println(child2 instanceof Child);
	}
}