public class BaseValue {
	public static void main(String[] args) {
		int decimalValue = 12; // 1x10^1 + 2x10^0 = 1x10 + 2x1 = 10 + 2 = 12
		// int octalValue = 014; // 1x8^1 + 4x8^0 = 1x8 + 4x1 = 8 + 4 = 12
		// int hexValue = 0xC; // 0-9, A-F => A:10, B:11, C:12
		// System.out.println("Decimal Value = " + decimalValue);
		// System.out.println("Octal Value = " + octalValue);
		// System.out.println("Hex Value = " + hexValue);
		System.out.printf("Decimal: %d\n", decimalValue);
		System.out.printf("  Octal: %o\n", decimalValue);
		System.out.printf("    Hex: %X\n", decimalValue);
	}
}