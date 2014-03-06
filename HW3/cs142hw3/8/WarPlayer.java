import java.util.*;

public class WarPlayer
{
	//members
	Card[] _my_cards;
//constructor
	public WarPlayer(Deck d)
	{
	_my_cards = new Card[26];//allocate an array of 26 Card pointers

	for (int i = 0; i< 26; i++)
	{
		_my_cards[i] = d.deal();
	}
}
	//enemy should have same number of cards, so we don't have to keep track, right?
public int compare(WarPlayer enemy)
{
	int j = 0; //for count this objects card wins
	int k = 0; //for counting enemy's card wins
	for(int i = 0; i < _my_cards.length; i++)
		{ //we could implement a compareTo method here
			if(_my_cards[i].getVal() < enemy.getCard(i).getVal())
				k++;
			else if(_my_cards[i].getVal() > enemy.getCard(i).getVal())
				j++;
			else if ( _my_cards[i].getVal() == enemy.getCard(i).getVal())
			{
				if(tieBreaker(_my_cards[i],enemy.getCard(i)))
					j++;
				else
					k++;
			}

		}
		System.out.printf("Player 1 has %d wins and player 2 has %d wins\n", j, k );
		return getResults(j, k);
	}
//helper methods
	private int getResults(int res1, int res2)
	{
		if (res1 > res2)
			return 1;
		else if( res2 > res1)
			return -1;
		else 
			return 0;

	}
	private boolean tieBreaker(Card one, Card two)
	{
		if( one.getSuitVal() > two.getSuitVal())
			return true;
		return false;
	}

	public Card getCard(int i)
	{
		return _my_cards[i];
	}

}//end class