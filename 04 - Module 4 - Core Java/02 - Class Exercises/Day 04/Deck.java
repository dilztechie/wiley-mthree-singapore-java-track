public class Deck {
	private Card[] cards;
	private static int deckIndex;
	
	public Deck() {
		String[] faces = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", 
							"Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Spades", "Hearts", "Diamond", "Clubs"};
		cards = new Card[52];
		int cardIndex = 0;
		for(int facesIndex = 0; facesIndex < faces.length; ++facesIndex) {
			for(int suitsIndex = 0; suitsIndex < suits.length; ++suitsIndex) {
				cards[cardIndex++] = new Card(faces[facesIndex], suits[suitsIndex]);
			}
		}
	}
	
	public Card[] shuffle() {
		java.util.Random random = new java.util.Random();
		for(int index = 0; index < cards.length; ++index) {
			int randomIndex = random.nextInt(52);
			Card currentCard = cards[index];
			cards[index] = cards[randomIndex];
			cards[randomIndex]= currentCard;
		}
		return cards;
	}
	
	public Card deal() {
		Card card = cards[deckIndex];
		deckIndex = deckIndex < 51 ? ++deckIndex : 0;
		return card;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	public Card[] getCards() {
		return cards;
	}
}