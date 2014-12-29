public class EvenPrint extends String {

	public void printEven(String subject) {
		int sLength = subject.length();
		int i = 0;
		while( i >= sLength) {
			System.out.print(subject.substring(i, i + 1));
			i = i + 2;
		}
	}
}