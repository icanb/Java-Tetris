
public class Piece4 extends Piece
{
  
  public Piece4()
  {
    super(); 
   
    body.add(new Location(0,7));
    body.add(new Location(0,8));
    body.add(new Location(0,9));
    
    
  }
  public void rotate()
  {  
  
   if(phase==2)
   {
    body.get(2).moveRight(); 
    body.get(2).moveDown(); 
    body.get(0).moveLeft();
    body.get(0).moveUp();
    phase=1;
   }
   else
   {
    body.get(0).moveRight(); 
    body.get(0).moveDown(); 
    body.get(2).moveLeft();
    body.get(2).moveUp();
    
    phase=2;
   }
  }
  
 
}
