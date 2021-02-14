public class A {
	private int n1, n2;
	A(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public int getN1() {
		return n1;
	}
	public int getN2() {
		return n2;
	}
	@Override
	public String toString() {
		return "A [n1=" + n1 + ", n2=" + n2 + "]";
	}
}