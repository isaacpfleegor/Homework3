import java.util.*;

public class Line
{
	private double _m;//slope of the line
	private double _b; //y intercept of the line

	public Line(Coord p1, Coord p2)
	{
		_m = p1.get_slope(p2);
		_b = p1.y_intercept(_m);
	}

	public Coord get_intersection(Line other)
	{
		double interceptDiff = _b - other.getIntercept();
		double slopeDiff = other.getSlope() - _m ;

		double xCoord = interceptDiff / slopeDiff;
		double yCoord = _m * xCoord + _b;
		
		Coord temp = new Coord((int)xCoord, (int)yCoord);

		return temp;
	}

	public double getSlope()
	{
		return _m;
	}
	public double getIntercept()
	{
		return _b;
	}
}