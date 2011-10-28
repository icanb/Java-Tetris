
public class Piece5 extends Piece
{
 
  public Piece5()
  {
    
    super(); 
   
    body.add(new Location(0,8));
    body.add(new Location(1,9));
    body.add(new Location(1,8));
    body.add(new Location(1,7));
    
    
  }
  public void rotate()
  {
    if(phase==1||phase==0)
    {
     body.get(3).moveDown();
     body.get(3).moveRight();
     
     phase=2;
    }
    else if(phase==2)
    {
       body.get(0).moveDown();
       body.get(0).moveLeft();
     
     phase=3;
    }
     else if(phase==3)
    {
      body.get(1).moveUp();
       body.get(1).moveLeft();
       phase=4;
    }
      else if(phase==4)
    {
        body.get(3).moveUp();
        body.get(3).moveLeft();
        body.get(0).moveUp();
        body.get(0).moveRight();
        body.get(1).moveDown();
        body.get(1).moveRight();
        phase=1;
      }
 }
  
 

}
