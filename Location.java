/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    public void setX(int x) { this.xCoord = x;}
    public void setY(int y) { this.yCoord = y;}

    public boolean equals(Object obj)
    {
        if (this == obj)
			return true;
		if (obj == null)
			return false;
        if (getClass() != obj.getClass())
			return false;
        Location loc = (Location)obj;
        return this.xCoord == loc.xCoord && this.yCoord == loc.yCoord;
    }
    public int hashCode()
    {
        return Integer.hashCode(xCoord) + Integer.hashCode(yCoord);
    }
}
