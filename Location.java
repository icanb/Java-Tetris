

public class Location
{

public Location(int y, int x)
{
  xcoor=x;
  ycoor=y;
  
}

public int getXval()
{
  return xcoor;
  
}

public int getYval()
{
  return ycoor;
}

public boolean isEqual(Location compare)
{
 if(xcoor==compare.getXval()&&ycoor==compare.getYval())
   return true;
   else
   return false;
}

public void moveDown()
{
  ycoor++;
}
public void moveUp()
{
  ycoor--;
}

public void moveLeft()
{
  xcoor--;
}

public void moveRight()
{
  xcoor++;
}


public Location oneDown()
{
 return new Location(ycoor+1,xcoor); 
}

public Location oneRight()
{
 return new Location(ycoor,xcoor+1); 
}

public Location oneLeft()
{
 return new Location(ycoor,xcoor-1); 
}
  public int xcoor;
  public int ycoor;
  
}
