package codingPrograms;

public class leapYearCalculator {

	public static void main(String[] args) {
		isLeapYear(2000);

	}
	public static void isLeapYear(int year) {
		if(year>=1 && year<=9999) {
			if(year%4==0) {
				if(year%100==0 && year%400==0) {
					System.out.println("true");
				}
				else
					System.out.println("false");
					
				
			}
		}
		else
			System.out.println("false");
	}

}
