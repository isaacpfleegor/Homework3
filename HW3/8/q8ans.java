import java.util.*;

public class q8ans
{
	public static void main(String[] args)
	{
		Random gen = new Random();
		Deck the_deck = new Deck();
		the_deck.shuffle(gen);

		WarPlayer p1 = new WarPlayer(the_deck);
		WarPlayer p2 = new WarPlayer(the_deck);

		int res = p1.compare(p2);
		if(res == 1)
			System.out.println("Player one wins!");
		if (res == 0)
			System.out.println("It's a tie! No one wins!");
		if( res == -1)
			System.out.println("Player two wins!");

	}
}