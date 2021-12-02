package codingPrograms;

public class speedConverter {
	public static void main(String[] args) {
		double milesPerHour = toMilesPerHour(10);
		System.out.println("Miles = "+ milesPerHour);
		
		printConversion(10);
	
	}

	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			return -1;
		}
		return Math.round(kilometersPerHour/1.609);
	
	}
	
	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour<0) {
			System.out.println("Invalid Value");
		}
		else {
			long milesPerHour = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + " Km/h = " + milesPerHour + " mi/h");
		}
	}

}
