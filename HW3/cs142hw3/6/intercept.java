import java.util.*;

public class intercept
{
	public static void main(String[] args)
	{
		Coord c1 = new Coord(0,0);
		Coord c2 = new Coord(3, 4);
		Line line_one = new Line(c1, c2);

		Coord c3 = new Coord(3, 0);
		Coord c4 = new Coord(0, 4);
		Line line_two = new Line(c3, c4);

		Coord res = line_one.get_intersection(line_two);

		System.out.println(res);
	}
}