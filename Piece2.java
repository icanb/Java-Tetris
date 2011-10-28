
public class Piece2 extends Piece
{

  
  public Piece2()
  {super(); 
  
    body.add(new Location(0,7));
    body.add(new Location(1,7));
    body.add(new Location(1,8));
    
  }
 public void rotate()
  {
   if(phase==1)
   {
      body.get(0).moveRight(); 
      body.get(1).moveUp(); 
      body.get(2).moveLeft();
    
      phase=2;
   }
   else if(phase==2||phase==0)
   {
     body.get(0).moveDown(); 
      body.get(1).moveRight(); 
      body.get(2).moveUp();
    
      phase=3;
   }
   else
   {
     body.get(0).moveLeft(); 
      body.get(0).moveUp(); 
      body.get(1).moveDown(); 
      body.get(1).moveLeft(); 
      body.get(2).moveRight();
      body.get(2).moveDown();
      
      phase=1;
   }
   
     
   }
  
}
