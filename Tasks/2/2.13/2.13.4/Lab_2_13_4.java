/*
 * Create new project called  TestEnum2. Add package 
 * “com.brainacad.oop.testenum2”.
Create a class Main with a main().
Create two enum type: Suit (which have SPADE, DIAMOND, CLUB, HEART) and
Rank (which have ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, 
JACK, QUEEN, KING values}.
Create class Card which has two private fields: cardSuit of Suit type and 
cardRank of Rank type. Add to Card constructor with cardSuit and cardRank 
arguments. In class Card override toString() method to return full name of card.
In method main() create and fill (using nested loops) array of Card objects 
(standard 52-card deck). 
Add code which iterate over Card array and print full card name to console.
Execute the program.
Example of program output:
The Card: KING_HEART
...
The Card: QUEEN_DIAMOND
...

 */

package com.brainacad.oop.testenum2;

public class Lab_2_13_4 {
	
	
	class Card{
		private Suit cardSuit;
		private Rank cardRank;
		
		public Card(Suit cardSuit, Rank cardRank){
			this.cardSuit = cardSuit;
			this.cardRank = cardRank;
		}
		
		@Override
		public String toString(){
			return "The Card: " + this.cardRank + "_" + 
		this.cardSuit;
		}
	}
	
	enum Suit {
		SPADE, DIAMOND, CLUB, HEART
	}
	
	enum Rank{
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, 
		JACK, QUEEN, KING
	}
	

	public static void main(String[] args) {
		Lab_2_13_4 l = new Lab_2_13_4();
		Card[][] arrayOfCards = new Card[4][13];
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 13; j++){
				arrayOfCards[i][j] = l.new Card(Suit.values()[i],
						Rank.values()[j]);
				System.out.println(arrayOfCards[i][j]);
			}
			
			System.out.println();
			
		}

	}

}
