import java.util.*;

public class Deck
{
    //members
    private Card[] _the_cards;
    private int _cards_dealt;


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

    public void shuffle(Random gen)
    {
	int i, j;
	Card temp;

	for ( i = 0; i < _the_cards.length; i ++ )
	    _the_cards[i].set_order(gen);

	for ( i = 0; i < _the_cards.length - 1; i ++ )
	    for ( j = i + 1; j < _the_cards.length; j ++ )
		if ( _the_cards[i].get_order() > _the_cards[j].get_order() )
		{
		    temp = _the_cards[i];
		    _the_cards[i] = _the_cards[j];
		    _the_cards[j] = temp;
		}
	
	_cards_dealt = 0;
    }

    public Card deal()
    {
	if ( _cards_dealt >= _the_cards.length )
	    throw new RuntimeException("All the cards have been dealt!");

	return _the_cards[_cards_dealt++];
    }
 
    public String toString()
    {
	String display = "";
	int i;

	for ( i = 0; i < _the_cards.length; i ++ )
	    display += _the_cards[i].toString() + "\n";

	return display;
    }

}