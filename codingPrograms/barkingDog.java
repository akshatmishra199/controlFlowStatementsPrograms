package codingPrograms;

public class barkingDog {

	public static void main(String[] args) {
		shouldWakeUp(true,1);
		shouldWakeUp(false,2);
		shouldWakeUp(true,8);
		shouldWakeUp(true,-1);

	}
	public static void shouldWakeUp(boolean barking, int hourOfDay) {
		if(barking==true && hourOfDay<8 && hourOfDay>=0) {
			System.out.println("true");
		}
		else
			System.out.println("false");
		
	}

}
