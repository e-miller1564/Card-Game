
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

	public boolean pilesFull(){
		if(piles[0].isFull() && piles[1].isFull() && piles[2].isFull() && piles[3].isFull() && piles[4].isFull()) {
			return true;
		}
		else {
			return false;
		}
	}

}
