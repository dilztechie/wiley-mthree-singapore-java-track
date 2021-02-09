public class Outer {
	int outerValue = 100;
	int count;
	
	void displayOuter() {
		for(count = 1; count <= 10; ++count) {
			// Modify this later as "Inner Anonymous Class"
			class Inner {
				void displayInner() {
					System.out.println("Inside Inner Class display() Method: outerValue " 
							+ count + " = " + (outerValue + count));
				}
			}
			Inner inner = new Inner();
			inner.displayInner();
		}
	}
}