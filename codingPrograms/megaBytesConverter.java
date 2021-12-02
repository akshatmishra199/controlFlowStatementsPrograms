package codingPrograms;

public class megaBytesConverter {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2500);

	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes<0) {
			System.out.println("Invalid Value");
		}
		int megaBytes = kiloBytes/1024;
		Math.round(kiloBytes);
		int kiloByte =  kiloBytes%1024;
		System.out.println(kiloBytes + " KB = "+ " "+megaBytes+" MB and "+kiloByte+" KB");
	}

}
