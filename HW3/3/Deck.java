import java.util.*;

public class Deck
{
    
    // members
    //  - an array of 52 card pointers
    private Card[] _the_cards;
    //  - the number of cards dealt
    private int _cards_dealt;

    // methods
    //  name: Deck
    //  desc: allocates an array of card pointers, 
    //     and fills it with card objects.  Also ensures
    //     that each possible card appears exactly once
    //     in the array. 
    //  params: none
    //  return: n/a
    //  1) allocate an array of 52 card pointers
    //  2) fill the first 13 elements with hearts   (L)
    //  3) fill the next 13 elements with diamonds  (L)
    //  4) fill the next 13 elements with clubs     (L)
    //  5) fill the last 13 elements with spades    (L)
    public Deck()
    {
	int i, number, suit;
	System.out.println("WEEEEEeeeeee!!!");
	_the_cards = new Card[52];
	
	i = 0;
	for ( suit = Card.LOWEST_SUIT; suit <= Card.HIGHEST_SUIT; suit ++ )
	    for ( number = Card.LOWEST_NUM; number <= Card.HIGHEST_NUM; number ++ )
		_the_cards[i++] = new Card(suit, number);
    }

    //  name: shuffle
    //  desc: shuffle's the deck by assigning a random 
    //    number to each card object and then sorting
    //    based on that random number. 
    //  params: Random gen
    //  return: void 
    //  1) for each element of the array, assign a random
    //     number to it.   (L)
    //  2) sort the card objects by their random numbers (L)
    //  3) set the number of cards dealt to be zero
    public void shuffle(Random gen)
    {
	int i, j;
	Card temp;

	// step 1
	for ( i = 0; i < _the_cards.length; i ++ )
	    _the_cards[i].set_order(gen);
	// step 2 // selection sort
	for ( i = 0; i < _the_cards.length - 1; i ++ )
	    for ( j = i + 1; j < _the_cards.length; j ++ )
		if ( _the_cards[i].get_order() > _the_cards[j].get_order() )
		{
		    temp = _the_cards[i];
		    _the_cards[i] = _the_cards[j];
		    _the_cards[j] = temp;
		}
	
	// step 3 
	_cards_dealt = 0;
    }

    //  name: deal
    //  desc: returns the address of next card on the deck
    //  params: none
    //  return: Card - the address of the next card
    //  1) use the number of cards dealt as an index into
    //  the array
    //  2) return the card whose address is stored at that index
    //  3) add one to the number of cards 
    public Card deal()
    {
	if ( _cards_dealt >= _the_cards.length )
	    throw new RuntimeException("All the cards have been dealt!");

	return _the_cards[_cards_dealt++];
    }
 
    //  name: toString
    //  desc: returns a giant string that contains
    //     every card in the deck
    //  params: none
    //  return: String
    //  1) set a display string to the empty string
    //  2) for each card in the deck, do step 3      (L)
    //  3)   add the card's toString result plus a newline to the display
    //  4) return the display string
    public String toString()
    {
	String display = "";
	int i;

	for ( i = 0; i < _the_cards.length; i ++ )
	    display += _the_cards[i].toString() + "\n";

	return display;
    }

}