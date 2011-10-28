

public class Piece3 extends Piece
{ 
 
  public Piece3()
  {
    super(); 
    
    body.add(new Location(0,8));
    body.add(new Location(1,8));
    body.add(new Location(1,7));
    body.add(new Location(2,7));
  }

   public void rotate()
  {
     if(phase==1)
   {
    body.get(0).moveDown(); 
    body.get(0).moveDown(); 
    body.get(1).moveDown(); 
    body.get(1).moveLeft();
    body.get(3).moveLeft();
    body.get(3).moveUp();
    
    phase=2;
   }
   else
   {
    body.get(0).moveUp(); 
    body.get(0).moveUp(); 
    body.get(1).moveUp(); 
    body.get(1).moveRight();
    body.get(3).moveRight();
    body.get(3).moveDown();
    phase=1;
   }
 }
   
 
}
