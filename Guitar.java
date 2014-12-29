public class Guitar {

	private WoodenObject myWoodenObject;
	private MusicalInstrument myInstrument;

	public Guitar() {
		this.myWoodenObject = new WoodenObject();
		this.myInstrument = new MusicalInstrument();
	}

	public static void main(String[] args) {
		Guitar myG = new Guitar();
		myG.myWoodenObject.burn();
		myG.myInstrument.play();
	}
}