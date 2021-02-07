public class TruthTable {
	public static void main(String[] args) {
		
		boolean conditionA, conditionB;
		
		System.out.println("Truth Table");
		System.out.println();
		
		System.out.println("&& {AND}");
		System.out.println("A \t B \t A&&B");
		
		conditionA = false;
		conditionB = false;
		System.out.println(conditionA + "\t" + conditionB + "\t" + (conditionA&&conditionB));

		conditionA = false;
		conditionB = true;
		System.out.println(conditionA + "\t" + conditionB + "\t" + (conditionA&&conditionB));

		conditionA = true;
		conditionB = false;
		System.out.println(conditionA + "\t" + conditionB + "\t" + (conditionA&&conditionB));

		conditionA = true;
		conditionB = true;
		System.out.println(conditionA + "\t" + conditionB + "\t" + (conditionA&&conditionB));
		
		System.out.println();

		System.out.println("|| {OR}");
		System.out.println("A \t B \t A||B");
		
		conditionA = false;
		conditionB = false;
		System.out.println(conditionA + "\t" + conditionB + "\t" + (conditionA||conditionB));

		conditionA = false;
		conditionB = true;
		System.out.println(conditionA + "\t" + conditionB + "\t" + (conditionA||conditionB));

		conditionA = true;
		conditionB = false;
		System.out.println(conditionA + "\t" + conditionB + "\t" + (conditionA||conditionB));

		conditionA = true;
		conditionB = true;
		System.out.println(conditionA + "\t" + conditionB + "\t" + (conditionA||conditionB));
		
		System.out.println();
		
		System.out.println("! {NOT}");
		System.out.println("A \t !A");
		
		conditionA = false;
		System.out.println(conditionA + "\t" + !conditionA);

		conditionA = true;
		System.out.println(conditionA + "\t" + !conditionA);

	}
}