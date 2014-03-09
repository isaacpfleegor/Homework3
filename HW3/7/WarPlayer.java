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

public int compare(WarPlayer enemy)
{
	int our_wins = 0; //for counting this objects card wins
	int enemy_wins = 0; //for counting enemy's card wins
	for(int i = 0; i < _my_cards.length; i++)
		{ 
			if(_my_cards[i].getVal() < enemy.getCard(i).getVal())
				enemy_wins++;
			else if(_my_cards[i].getVal() > enemy.getCard(i).getVal())
				our_wins++;
			else if ( _my_cards[i].getVal() == enemy.getCard(i).getVal())
			{
				if(tieBreaker(_my_cards[i],enemy.getCard(i)))
					our_wins++;
				else
					enemy_wins++;
			}

		}
		return getResults(our_wins, enemy_wins);
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