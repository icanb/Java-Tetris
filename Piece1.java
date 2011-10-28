

public class Piece1 extends Piece
  
{
 
 
  public Piece1()
  {
   
   super(); 
   
    body.add(new Location(0,8));                
    body.add(new Location(1,8));
    body.add(new Location(1,9));
    body.add(new Location(2,9));
    
 
   
  }
  
  public void rotate()
  {
   if(phase==1)
   {
    body.get(0).moveRight(); 
    body.get(0).moveDown(); 
    body.get(2).moveDown(); 
    body.get(2).moveLeft();
    body.get(3).moveLeft();
    body.get(3).moveLeft();
    
    phase=2;
   }
   else
   {
    body.get(0).moveLeft(); 
    body.get(0).moveUp(); 
    body.get(2).moveUp(); 
    body.get(2).moveRight();
    body.get(3).moveRight();
    body.get(3).moveRight();
    phase=1;
   }
  }
  
  
}
