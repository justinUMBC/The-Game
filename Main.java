import java.swing.*;
import java.awt.*;
//Impossible Maze Game
//By: JJJM
//For Lasser's Class
Public class Main extends JFrame
{
  private static final int Width = 800;
  private static final int Height = 600;
  
  public theGame()
  {
    super("Impossible Maze");
    setSize(Width,Height);
    
    Game game = new Game();
    
    ((Component)game).setFocusable(true);
    getContentPane().add(game);
    
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String args[])
  {
    Main run = new Main();
  }
  
}
