
import java.util.*;

public class firstjack
{
	public static void main(String[] args)
	{
		Card p1, p2;
		Random gen = new Random();
		//p1 = new Card(gen);
		//p2 = new Card(gen);

		while ( true )
		{
			p1 = new Card(gen);
			p2 = new Card(gen);	
			System.out.println(p1);

			if ( p1.getVal() == 11 )
			{
				System.out.println("Jack!  P1 wins!");
				break;
			}

			System.out.println(p2);

			if ( p2.getVal() == 11 )
			{
				System.out.println("Jack!  P2 wins!");
				break;
			}
		}
	}//end main

}//end class