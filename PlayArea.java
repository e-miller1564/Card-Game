
public class PlayArea {

	private Pile[] piles;

	public PlayArea() {
		piles = new Pile[5];
		initializePiles();
	}

	private void initializePiles() {
		for(int i = 0; i < piles.length; i++) {
			piles[i] = new Pile();
		}
	}

	public Pile[] getPiles() {
		return piles;
	}

}
