package controller;
public class CalendarController {
	double julianDate = 0.0;
	public int calendar(int day, int month, int year) {
		int date = day + month + year; 
		int base = 15 + 10 + 1582;
		
		if (month < 3) {
			year--;
			month += 12;
		}
		
		if (date >= base) {
			double a = year / 100;
			double b = a / 4;
			double c = 2 - a + b;
			double d = 365.25 * (year + 4716);
			double e = 30.6001 * month + 1;
			julianDate = (d + e + day + 0.5 + c - 1524.5) + 30;
		}
		if (julianDate == (int)Math.round(julianDate)) {
			julianDate--;
			return (int)Math.round(julianDate);
		}
		return (int)Math.round(julianDate);
	}
	
}
