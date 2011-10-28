
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class FrameCreator extends JFrame
{
 public int size;


 private Timer t;
 TetrisPainter canvas;
   public FrameCreator()
   {
     
    //pause button
     final JButton pause = new JButton("Pause");
    final JButton restart = new JButton("Restart");
     
     //draws the board
     canvas=new TetrisPainter();
     
     //creates the frame and makes the layout
     final JFrame frame = new JFrame();
     final JPanel panel1 = new JPanel();
    
     final JPanel panel3 = new JPanel();
     final JLabel point=new JLabel();
     final JPanel panelall = new JPanel();
     
      
     //adjusts the size of the board according to the size of the game
     frame.setSize(480,660);
     frame.setTitle("The Mighty Game of TETRIS!");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     point.setText(String.valueOf(canvas.getPoint()));
     //makes the layout
        
    // panel2.setLayout(new GridLayout(1,1));
     panelall.setLayout(new BorderLayout());
     panel3.add(point);
     panel1.add(pause);
     panel1.add(restart);
   
     panelall.add(panel3, BorderLayout.EAST);
     panelall.add(canvas, BorderLayout.CENTER);
     panelall.add(panel1, BorderLayout.SOUTH);
     
     frame.add(panelall);
     frame.setResizable(false);
     frame.setVisible(true);
     
   
     
    
     
     //the commends that will be implied when the button is pressed
       
    
      class AddInterestListener implements ActionListener
     {
       
       public void actionPerformed(ActionEvent event)
       {
         if(t.isRunning())
         {t.stop();
         pause.setText("Start");
         }
         else
         {
           t.start();
         pause.setText("Pause");
         }
       }
     }
     
     ActionListener listener = new AddInterestListener();
     pause.addActionListener(listener);
     
       class AddInterestListener2 implements ActionListener
     {
       
       public void actionPerformed(ActionEvent event)
       {
         canvas.restart();
         
       }
     }
     
     ActionListener listener2 = new AddInterestListener2();
     restart.addActionListener(listener2);
  
  
       
     
   
  class TimerListener implements ActionListener
    
      {
      public void actionPerformed(ActionEvent event)
      {
 canvas.flowConstant();
  point.setText(String.valueOf(canvas.getPoint()));
      }
    }

  ActionListener listener6 = new TimerListener();
   
   t = new Timer(300, listener6);    
    
   
   
     KeyboardFocusManager manager;
      
      manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
      manager.addKeyEventPostProcessor(new PostProcessor());
  
  t.start();
  

  }



     class PostProcessor
                implements KeyEventPostProcessor{

  public boolean postProcessKeyEvent(KeyEvent e){
    if(t.isRunning())
    {
    if(e.getKeyChar()=='s'&&getEventType(e.getID())=="keyPressed")
    { canvas.flowConstant();
    }
    if(e.getKeyChar()=='a'&&getEventType(e.getID())=="keyPressed")
    { 
      canvas.moveLeft();
    }
     if(e.getKeyChar()=='d'&&getEventType(e.getID())=="keyPressed")
    { 
      canvas.moveRight();
    }
     if(e.getKeyChar()=='w'&&getEventType(e.getID())=="keyPressed")
    { 
      canvas.rotate();
    }
    }
     
    return true;
  }//end postProcessKeyEvent
//---------------------------------------------//

String getEventType(int ID){
  if(ID == KeyEvent.KEY_PRESSED){
    return "keyPressed";
  }else if(ID == KeyEvent.KEY_RELEASED){
    return "keyReleased";
  }else if(ID == KeyEvent.KEY_TYPED){
    return "keyTyped";
  }else{
    return "Unknown event type";
  }
    
}
     
    
   }




  

   
  
   }
