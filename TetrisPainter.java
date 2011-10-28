import java.awt.*;
import javax.swing.*;

public class TetrisPainter extends JComponent
{
   
  private Tetris game;
  private int[][] graph;
  
   public TetrisPainter()
   {//adjusts the properties
     game=new Tetris();
     graph=new int[20][15];
   }
   
        
   public void paintComponent(Graphics g)
   { 
     
     
       for(int y=0; y<20; y++)
       {
         for(int x=0; x<15; x++)
         {
           graph[y][x]=0;
         }
       }
    
       try
       {
         for(Piece body: game.getComponents())
         {
           for(Location loc: body.getBody())
           {
             
             graph[loc.getYval()][loc.getXval()]=1;
           }
         }
       }
       catch(Exception e)
       {
         System.out.print("123!");    
         
       }
       
       
            
       g2 = (Graphics2D) g;
     
       
       try
     {
       //draws the board.
       for(int r=0;r<20;r++)
       {
         for(int c=0;c<15;c++)
         {
           //Rectangle box = new Rectangle((c)*30+1,(r)*30+1, 28, 28);
           //g2.draw(box);
          
           //if its a living cells it makes it red, otherwise green
           if(graph[r][c]==1)
             g.setColor(Color.RED);
           else
             g.setColor(Color.YELLOW);
           
        
           g.fillRect((c)*30+1,(r)*30+1, 28, 28);
           
         }
       }
       //creates the next generation
     }
     catch(Exception e)
     {
       System.out.print("You looooose!");    
       
     }
     
   }
   
   /*public void nexMove(String a)
   {
     board1.nextMovement(a);
     repaint();
   }
   */
   
    public void flowConstant()
   {
     game.flow();
     repaint();
   }
    
    public void moveLeft()
    {
      game.shiftLeft();
      repaint();
    }
    
     public void moveRight()
    {
      game.shiftRight();
      repaint();
    }
    
       public void rotate()
    {
      game.rotate();
      repaint();
    }
       
   public int getPoint()
   {
        return game.getComponents().size()-1; 
     
   }
   
   public void restart()
   {
    game=new Tetris();
     graph=new int[20][15]; 
   }
  
  public Graphics2D g2;

}