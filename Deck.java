import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Deck {

	private ArrayList<Card> deck;

	public Deck() {
		deck = new ArrayList<Card>();
		populateDeck();
	}

	private void populateDeck() {
		int numOfDaggers = 5;
		int numOfSwords = 5;
		int numOfMorningStars = 3;
		int numOfWarAxes = 3;
		int numOfHalberds = 2;
		int numOfLongSwords = 2;
		int numOfArchers = 2;
		int numOfShields = 2;

		//Creating and adding crown card to deck
		deck.add(new Card("Crown", 0, new ImageView(new Image("textures/Cards/Crown Card.jpg"))));
		//Creating and adding dagger cards to deck
		for(int i = 0; i < numOfDaggers; i ++) {
			deck.add(new Card("Dagger", 1, new ImageView(new Image("textures/Cards/Dagger Card.jpg"))));
		}
		//Creating and adding sword cards to deck
		for(int i = 0; i < numOfSwords; i ++) {
			deck.add(new Card("Sword", 2, new ImageView(new Image("textures/Cards/Sword Card.jpg"))));
		}
		//Creating and adding morning star cards to deck
		for(int i = 0; i < numOfMorningStars; i ++) {
			deck.add(new Card("Morning Star", 3, new ImageView(new Image("textures/Cards/Morning Star Card.jpg"))));
		}
		//Creating and adding war axe cards to deck
		for(int i = 0; i < numOfWarAxes; i ++) {
			deck.add(new Card("War Axe", 4, new ImageView(new Image("textures/Cards/War Axe Card.jpg"))));
		}
		//Creating and adding halberd cards to deck
		for(int i = 0; i < numOfHalberds; i ++) {
			deck.add(new Card("Halberd", 5, new ImageView(new Image("textures/Cards/Halberd Card.jpg"))));
		}
		//Creating and adding long sword cards to deck
		for(int i = 0; i < numOfLongSwords; i ++) {
			deck.add(new Card("Long Sword", 6, new ImageView(new Image("textures/Cards/Long Sword Card.jpg"))));
		}
		//Creating and adding archer cards to deck
		for(int i = 0; i < numOfArchers; i ++) {
			deck.add(new Card("Archer", 0, new ImageView(new Image("textures/Cards/Archer Card.jpg"))));
		}
		//Creating and adding shield cards to deck
		for(int i = 0; i < numOfShields; i ++) {
			deck.add(new Card("Shield", 0, new ImageView(new Image("textures/Cards/Shield Card.jpg"))));
		}

		//Special cards contain a value of 0 as they play by different rules than the normal cards
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

}
