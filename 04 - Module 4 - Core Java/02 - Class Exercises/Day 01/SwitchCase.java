public class SwitchCase {
	public static void main(String[] args) {
	/*	
		if(month == 1) {
			days = 31;
		} else if(month == 2) {
			days = 28;
		} else if(month == 3) {
			days = 31;
		} else if(month == 4) {
			days = 30;
		} else if(month == 5) {
			days = 31;
		} else if(month == 6) {
			days = 30;
		} else if(month == 7) {
			days = 31;
		} else if(month == 8) {
			days = 31;
		} else if(month == 9) {
			days = 30;
		} else if(month == 10) {
			days = 31;
		} else if(month == 11) {
			days = 30;
		} else if(month == 12) {
			days = 31;
		}
	*/
	/*	
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
		} else if(month == 2) {
			days = 28;
		} else {
			days = 30;
		}
	*/
		
		int month = 6;
		int days = 0;

		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: days = 31; break;
			case 2: days = 28; break;
			default: days = 30;
		}
		System.out.println("Number of Days in Month " + month + " are " + days);
	}
}