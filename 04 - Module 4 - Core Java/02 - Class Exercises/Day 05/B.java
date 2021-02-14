public class B extends A {
	private int n3;
	B(int n1, int n2, int n3) {
		super(n1, n2);
		this.n3 = n3;
	}
	public int getN3() {
		return n3;
	}
	@Override
	public String toString() {
		return "B [n1=" + getN1() + ", n2=" + getN2() + ", n3=" + n3 + "]";
	}
}