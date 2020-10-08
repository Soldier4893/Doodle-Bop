import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Main {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JLayeredPane pane = new JLayeredPane();
    Character per = new Character();
    Background back = new Background();
    backgroundMusic music = new backgroundMusic();
    //music.musicPlayer();
    frame.add(per);
    //frame.getContentPane().add(per);



    frame.setSize(10000,1000);
    frame.setVisible(true);
    frame.setBackground(Color.black);
    frame.setForeground(Color.black);

    frame.setTitle("Doodle Bop");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setResizable(false);









  }


}
