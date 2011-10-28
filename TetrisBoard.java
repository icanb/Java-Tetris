
import java.util.*;



public class TetrisBoard
{
  public Piece current;
  private ArrayList<Piece> placed;
  
  public TetrisBoard(Piece first)
  {
    current=first;
    placed=new ArrayList<Piece>();
  placed.clear();
   
  }
  
  public void newPiece(Piece np)
  {
    placed.add(current);
    current=np;
  }
  
  public ArrayList<Piece> getItems()
  {
  
   return placed; 
  }
  
  public void move()
  { 
    current.moveDown();
  }
  
  public ArrayList<Piece> getAll()
  {
   ArrayList<Piece> all=new ArrayList<Piece>();
   //Collections.copy(all,placed);
   all.add(current);
    for(Piece next: placed)
    {
     all.add(next); 
    }
    
   return all;
  }
  
  public Piece getCurrent()
  {
   return current; 
  }
  
  public boolean movable()
  {
    for(Location loccur: current.getBody())
    {
      if(loccur.getYval()>18)
        return false;
      
      for(Piece placedpiece: placed)
      {
        for(Location loc: placedpiece.getBody())
        {
          if(loc.isEqual(loccur.oneDown()))
            return false;
        }
      }
    }
    
 
    

    return true;
    
  }
     public void moveLeft()
  {
      boolean flag=true;
    for(Location loccur: current.getBody())
    {
      if(loccur.getXval()<1)
        flag= false;
       for(Piece placedpiece: placed)
      {
        for(Location loc: placedpiece.getBody())
        {
          if(loc.isEqual(loccur.oneLeft()))
            flag= false;
        }
      }
    }
    
      if(flag)
        current.left();
    }
    
    public void moveRight()
  {
      boolean flag=true;
    for(Location loccur: current.getBody())
    {
      if(loccur.getXval()>13)
        flag= false;
       for(Piece placedpiece: placed)
      {
        for(Location loc: placedpiece.getBody())
        {
          if(loc.isEqual(loccur.oneRight()))
            flag= false;
        }
      }
    }
    
      if(flag)
        current.right();
    }
    
    public void rotate()
    { 
      boolean flag=true;
      current.rotate();
      
      for(Location loccur: current.getBody())
      {
        if(loccur.getXval()>14)
          flag= false;
         if(loccur.getXval()<0)
          flag= false;
        for(Piece placedpiece: placed)
        {
          for(Location loc: placedpiece.getBody())
          {
            if(loc.isEqual(loccur))
              flag= false;
          }
        }
      }
      
      if(!flag) 
      {
       current.setBackPhase();
       current.rotate();
      }
      
     
    }
}
