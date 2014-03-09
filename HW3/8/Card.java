import java.util.*;

public class Card
{
	public static final int LOWEST_NUM = 2;
	public static final int HIGHEST_NUM = 14;
	public static final int HIGHEST_SUIT = 4;
	public static final int LOWEST_SUIT = 1;
	private int number;
	private String suit;
	private int suitVal;
	private int order;

	public Card(int suitNum, int number)
	{
		int num = suitNum;
		suitVal = num;
		if ( num == 0 )
			suit = "HEARTS";
		else if ( num == 1 )
			suit = "DIAMONDS";
		else if ( num == 2 )
			suit = "CLUBS";
		else 
			suit = "SPADES";

		this.number = number;
	}   

	public Card(Random gen)
	{
		number = Math.abs( gen.nextInt() ) % 13 + 2;
		int num = Math.abs( gen.nextInt() ) % 4;
		suitVal = num;
		if ( num == 0 )
			suit = "HEARTS";
		else if ( num == 1 )
			suit = "DIAMONDS";
		else if ( num == 2 )
			suit = "CLUBS";
		else 
			suit = "SPADES";
	}  
	public void set_order(Random gen)
	{
		order = gen.nextInt();
	}
	public int get_order()
	{
		return order;
	}
	public int getVal()
	{
		return number;
	}
	public int getSuitVal()
	{
		return suitVal;
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