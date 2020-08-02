import javafx.scene.image.ImageView;

public class Card implements Comparable<Card> {

	private String weapon;
	private int value;
	private ImageView frontCardImage;

	public Card(String weapon, int value, ImageView frontCardImage) {
		this.weapon = weapon;
		this.value = value;
		this.frontCardImage = frontCardImage;
	}

	@Override
	public int compareTo(Card c) {

		//return 2 if both cards return to piles
		if(weapon.equals("Archer") && c.weapon.equals("Shield"))
			return 2;

		//return -2 if both cards are removed from play
		else if(value == c.value || c.weapon.equals("Shield"))
			return -2;

		/*
		 * return 0 if player attempts to use shield to attack (shield card cannot attack)
		 * return 1 if this.card.value > c.value, player successfully attacks enemy crown card with their crown card or they use an archer
		 * 		aka. this.card beats Card c
		 * return -1 if this.card.value < c.value
		 * 		aka. this.card loses to Card c
		*/
		else {
			if(weapon.equals("Shield"))
				return 0;
			else if(value > c.value || (weapon.equals("Crown") && c.weapon.equals("Crown")) || weapon.equals("Archer"))
				return 1;
			else
				return -1;
		}
	}

	public String getWeapon() {
		return weapon;
	}

	public int getValue() {
		return value;
	}

	public ImageView getFrontCardImage() {
		return frontCardImage;
	}

}
