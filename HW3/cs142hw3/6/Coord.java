import java.util.*;

public class Coord
{
	private double _x, _y;

	public Coord(int x, int y)
	{
		_x = x;
		_y = y;
	}
	//should we determine which was is farther away first?
	public double get_slope(Coord c)
	{
		double x, y;
		x = y = 0;

		x = c.getX() - _x;
		y = c.getY() - _y;

		return x / y;
	}
	public double y_intercept(double slope)
	{
		return _y - slope * _x;
	}
	public double getX()
	{
		return _x;
	}
	public double getY()
	{
		return _y;
	}
	
	public String toString()
	{
		return "x: "+ _x + " y: "+ _y;
	}
}