
public class DateTime {
	int day;
	int month;
	int year;
	int hours;
	int minutes;
	int seconds;
	
	DateTime(int day, int month){
		this.day =day;
		this.month = month;
	}
	
	DateTime(int day, int month, int year){
		this.day =day;
		this.month = month;
		this.year = year;
	}
	
	DateTime(int day, int month, int year,int hours){
		this.day =day;
		this.month = month;
		this.year = year;
		this.hours =hours;

	}
	
	DateTime(int day, int month, int year,int hours, int minutes){
		this.day =day;
		this.month = month;
		this.year = year;
		this.minutes =minutes;
		this.hours = hours;

	}
	
	DateTime(int day, int month, int year,int hours, int minutes,int seconds){
		this.day =day;
		this.month = month;
		this.year = year;
		this.minutes =minutes;
		this.hours = hours;
		this.seconds = seconds;

	}
	void shortDate(){
		System.out.println(day +"-"+ month);	
	}
	
	void longDate() {
		System.out.println( day +"-"+ month+"-"+ year);
		
	}
	
	void shortTime() {
		System.out.println(hours +":"+ minutes);
		
	}
	void longTime() {
		System.out.println(hours +":"+ minutes+":"+seconds);
		
	}
	
	

}
