public class TimeTest2 {
	public static void main(String[] args) {
		Time2 time1 = new Time2();						// 00:00:00
		Time2 time2 = new Time2(10);					// 10:00:00
		Time2 time3 = new Time2(12, 26);				// 12:26:00
		Time2 time4 = new Time2(15, 12, 26); 			// 15:12:26
		Time2 time5 = new Time2(11, 75, 68);			// 11:00:00
		Time2 time6 = new Time2(time4);					// 15:12:26
		
		System.out.printf("%50s %10s %15s\n", 
				"Constructed with default arguments : ", time1.toUniversalString(), time1);
		System.out.printf("%50s %10s %15s\n", 
				"Constructed with only hour : ", time2.toUniversalString(), time2);
		System.out.printf("%50s %10s %15s\n", 
				"Constructed with hour & minute : ", time3.toUniversalString(), time3);
		System.out.printf("%50s %10s %15s\n", 
				"Constructed with hour, minute & second : ", time4.toUniversalString(), time4);
		System.out.printf("%50s %10s %15s\n", 
				"Constructed with invalid time : ", time5.toUniversalString(), time5);
		System.out.printf("%50s %10s %15s\n", 
				"Constructed with time4 object : ", time6.toUniversalString(), time6);
	}
}