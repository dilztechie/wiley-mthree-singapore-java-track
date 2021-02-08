import java.util.Scanner;
public class DateTime {
	private int day, month, year, hours, minutes, seconds;
	
	
	DateTime(int day, int month){
		this.day = day;
		this.month = month;
	}
	DateTime(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	DateTime(int day, int month, int year, int hours){
		this.day = day;
		this.month = month;
		this.year = year;
		this.hours = hours;
	}
	DateTime(int day, int month, int year, int hours, int minutes){
		this.day = day;
		this.month = month;
		this.year = year;
		this.hours = hours;
		this.minutes = minutes;
	}
	DateTime(int day, int month, int year, int hours, int minutes, int seconds){
		this.day = day;
		this.month = month;
		this.year = year;
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	void shortDate(){
		System.out.println(this.day + "-" + this.month);
	}
	void longDate(){
		System.out.println(this.day + "-" + this.month + "-" + this.year);
	}
	void shortTime(){
		System.out.println(this.hours + ":" + this.minutes);
	}
	void longTime(){
		System.out.println(this.hours + ":" + this.minutes + ":" + this.seconds);
	}	
}