public class LecturerLaunch {

	public static void main(String[] args) {
		Lecturer x = new Lecturer("Bob");
		x.teach("poker");
		x.doResearch("Polymorphism");
		System.out.println(x.getName());
		}

}