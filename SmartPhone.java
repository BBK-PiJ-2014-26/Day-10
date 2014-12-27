public class SmartPhone extends MobilePhone {

	/**
	* Prints a mesage telling a user that they have opened the specified web address.
	*/
	public void browseWeb(String address) {
		System.out.println("Opening web page: " + address + "...");
	}

	/**
	* Returns fictious GPS co-ordinates.
	*/
	public String findPosition() {
		double x = 12.265;
		double y = 98.756;
		String result = x + "N, " + y + "E";
		return result;
	}

}