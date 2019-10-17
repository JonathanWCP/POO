package view;

import javax.swing.JOptionPane;

import controller.CalendarController;

public class CalendarView {
	public static void main(String[] args) {
		CalendarController calendar = new CalendarController();
		JOptionPane.showMessageDialog(null, "Insert the date sequencially day, month and year");
		int day = Integer.parseInt(JOptionPane.showInputDialog("Day"));
		int month = Integer.parseInt(JOptionPane.showInputDialog("Month"));
		int year = Integer.parseInt(JOptionPane.showInputDialog("Year"));
		int result = calendar.calendar(day, month, year);
		System.out.println(result);
	}
}
