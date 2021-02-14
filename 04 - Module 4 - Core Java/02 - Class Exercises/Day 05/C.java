public class C extends B {
	int n4, n5;
	C(int n1, int n2, int n3, int n4, int n5) {
		super(n1, n2, n3);
		this.n4 = n4;
		this.n5 = n5;
	}
	@Override
	public String toString() {
		return "C [n1=" + getN1() + ", n2=" + getN2() + ", n3=" + getN3() + ", n4=" + n4 + ", n5=" + n5 + "]";
	}
}