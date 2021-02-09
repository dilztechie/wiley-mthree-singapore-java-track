public class CardGame {
	public static void main(String[] args) {
		Deck deck = new Deck();
		Card[] cards = deck.getCards();
		for(int index = 0; index < cards.length;) {
			System.out.printf("%20s %20s %20s %20s\n", 
					cards[index++].getCard(), 
					cards[index++].getCard(), 
					cards[index++].getCard(), 
					cards[index++].getCard()	);
		}
		System.out.println();
		java.util.Scanner in = new java.util.Scanner(System.in);
		int players = 0;
		do {
			System.out.print("Number of Players [1-4]? ");
			players = in.nextInt();
			if(players < 1 || players > 4) {
				System.out.println("Invalid Input!");
			}
		} while(players < 1 || players > 4);
		in.close();
		Card[] shuffledCards = deck.shuffle();
		deck.setCards(shuffledCards);
		System.out.println("Shuffled Cards:");
		for(int index = 0; index < deck.getCards().length; ++index) {
			for(int player = 1; player <= players; ++player) {
				System.out.printf("%20s", deck.deal().getCard());
			}
			System.out.println();
		}
	}
}