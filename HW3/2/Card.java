import java.util.*;

public class Card
{
	public static final int LOWEST_NUM = 2;
	public static final int HIGHEST_NUM = 14;
	public static final int HIGHEST_SUIT = 0;
	public static final int LOWEST_SUIT = 4;
	
	private int number;
	private String suit;

	public Card(Random gen)
	{
		number = Math.abs( gen.nextInt() ) % 13 + 2;
		int num = Math.abs( gen.nextInt() ) % 4;
		if ( num == 0 )
			suit = "HEARTS";
		else if ( num == 1 )
			suit = "DIAMONDS";
		else if ( num == 2 )
			suit = "CLUBS";
		else 
			suit = "SPADES";
	}  
	public Card(String suit, int number)
	{
		this.number = number;
		this.suit = suit;
	}  

	public int getVal()
	{
		return number;
	}

	public String toString()
	{
		String r = "";

		if ( number == 14 )
			r += "ACE";
		else if ( number == 13 )
			r += "KING";
		else if ( number == 12 )
			r += "QUEEN";
		else if ( number == 11 )
			r += "JACK";
		else
			r += number;

		r += " of " + suit;

		return r;
	}
}