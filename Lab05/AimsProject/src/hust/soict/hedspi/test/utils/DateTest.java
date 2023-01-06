package hust.soict.hedspi.test.utils;
import java.util.Scanner;

import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {

	public static void main(String[] args)throws Exception {
		MyDate date1 = new MyDate("February 18th 2000");
		date1.print();
		System.out.println(" ");
		MyDate date2 = new MyDate();
		date2.print();
		System.out.println(" ");
		MyDate date3 = new MyDate("second","September","Two Thousand Nine");
		date3.print();
		System.out.println(" ");
		MyDate date4 = new MyDate(2,4,2021);
		date4.print();
		System.out.println(" ");
		System.out.println("Choose one option of date formats below:");
		System.out.println("1.yyyy-MM-dd");
		System.out.println("2.d/M/yyyy");
		System.out.println("3.dd-MMM-yyyy");
		System.out.println("4.MMM d yyyy");
		System.out.println("5.mm-dd-yyyy");
		Scanner keyboard = new Scanner(System.in);
		int formatChoice = 0;
		System.out.println("Enter number of the option you want");

	}

}