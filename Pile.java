import java.util.Stack;

public class Pile {

	private Stack<Card> cardStack;

	public Pile() {
		cardStack = new Stack<Card>();
	}

	public Card checkCard() {
		return cardStack.peek();
	}

	public Card removeCard() {
		return cardStack.pop();
	}

	public void insertCard(Card c) {
		cardStack.push(c);
	}

	public boolean isFull() {
		if(cardStack.size() == 5){
			return true;
		}
		else
			return false;
	}

	public boolean isEmpty() {
		return cardStack.empty();
	}
}
