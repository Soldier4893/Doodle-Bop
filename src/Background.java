import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Background extends JPanel implements KeyListener, ActionListener {
  public Timer timer;
  int posX = 0;
  int posY = 0;
  backgroundMusic audio = new backgroundMusic();

  public Background(){
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
    timer = new Timer(0,this);
    timer.start();




  }
  public void paint(Graphics g){
    //resize per = new resize();
    //ImageIcon icon = per.scaleImage(new ImageIcon(""),500,500);

    g.setColor(Color.black);
    //g.drawImage(icon.getImage(), 0,0,10,10,null);
    g.fillRect(0,0,10000,1000);



    //icon.paintIcon(this,g,posX,posY);
    g.dispose();


  }


  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

}

  @Override
  public void keyReleased(KeyEvent e) {

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    timer.start();
    repaint();
  }
}
