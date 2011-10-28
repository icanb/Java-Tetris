
import java.awt.*;
import java.util.*;
import java.util.Random;


public class Tetris
{
Random randomizer=new Random();
TetrisBoard newgame;

public Tetris()
{//creates a board that is 2 cell bigger than the actual one, so that it can be manipulated without any problem.
  
    Piece first=new Piece1();
  
    switch (randomizer.nextInt(5)) {
            case 0:  first=new Piece1(); break;
            case 1:  first=new Piece2(); break;
            case 2:  first=new Piece3(); break;
            case 3:  first=new Piece4(); break;
            case 4:  first=new Piece5(); break;
            
        }
  
   

  newgame= new TetrisBoard(first);

   
    
}

public ArrayList<Piece> getComponents()
{
  return newgame.getAll();
}


public void flow()
{ //newgame.move();
   //Piece newpiece=new Piece1();
  if(newgame.movable())
  {
    newgame.move();
   
  }
  else
  {
  
    switch (randomizer.nextInt(5)) {
            case 0:  newgame.newPiece(new Piece1()); break;
            case 1:  newgame.newPiece(new Piece2()); break;
            case 2:  newgame.newPiece(new Piece3()); break;
            case 3:  newgame.newPiece(new Piece4()); break;
            case 4:  newgame.newPiece(new Piece5()); break;
            
        }
  
      
    
  }
  
}

public void rotate()
{ 
  newgame.rotate();
  
}

public void shiftLeft()
{ 
  newgame.moveLeft();
  
}
public void shiftRight()
{ 
  newgame.moveRight();
  
}

}

