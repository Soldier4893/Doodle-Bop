import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.nio.Buffer;

public class Character extends JPanel implements KeyListener, ActionListener {
  private Timer timer;
  int posX = 0;
  int posY = 0;
  public Character(){
  addKeyListener(this);
  setFocusable(true);
  setFocusTraversalKeysEnabled(false);
    timer = new Timer(0,this);
    timer.start();

  }
  public void paint(Graphics g){
    resize pic = new resize();
    //ImageIcon per = pic.scaleImage(new ImageIcon(""),500,500);
    //g.drawImage(per.getImage(), posX,posY,400,400,null);
    g.setColor(Color.blue);
    g.fillRect(posX,posY,300,300);

    //per.paintIcon(this,g,posX,posY);
    g.dispose();

  }
  @Override
  public void actionPerformed(ActionEvent e) {
    timer.start();
    repaint();
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();
    if(key==KeyEvent.VK_RIGHT) {
      posX += 20;
      //audio.musicPlayer("effect");
    }


    if(key==KeyEvent.VK_LEFT) {
      posX -= 20;
      //audio.musicPlayer("effect");

    }
    if(key==KeyEvent.VK_DOWN) {
      posY += 20;
      System.out.println("left");
      //audio.musicPlayer("effect");
    }
    if(key==KeyEvent.VK_UP) {
      posY -= 20;
      System.out.println("left");
      //audio.musicPlayer("effect");
    }


  }

  @Override
  public void keyReleased(KeyEvent e) {

  }
}
