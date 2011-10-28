

import java.util.*;



public class Piece
{
protected ArrayList<Location> body;
protected int phase;

public Piece()
{
 body=new ArrayList<Location>(); 
  phase=1;
}

public void move()
{
  for(int b=0; b<body.size(); b++)
  {
    body.get(b).moveDown();
  }
}

public void setBackPhase()
{
 phase=phase-2; 
}

public void rotate()
{
  
}

public Piece getRotated()
{
  return new Piece();
}
  
 
public ArrayList<Location> getBody()
{
 return body; 
}

public void moveDown()
{
  for(int i=0;i<body.size();i++)
  {
   body.get(i).moveDown(); 
  }
}

public void left()
{
  for(int i=0;i<body.size();i++)
  {
   body.get(i).moveLeft(); 
  }
}

public void right()
{
  for(int i=0;i<body.size();i++)
  {
   body.get(i).moveRight(); 
  }
}
}