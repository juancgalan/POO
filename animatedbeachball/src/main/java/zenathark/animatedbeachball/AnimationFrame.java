package zenathark.animatedbeachball;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class AnimationFrame extends JFrame {

  private JButton fakeball;

  {
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    init();
    setVisible(true);
    animate();
    /*new Thread(() -> {
      for(;;) {
        Point a = fakeball.getLocation();
        fakeball.setLocation(a.x + 1, a.y + 1);
        try {
          sleep(30);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }).run();*/
  }

  private void init() {
    JPanel panel = new JPanel();
    panel.setLayout(null);
    fakeball = new JButton("holi");
    fakeball.setLocation(5, 200);
    fakeball.setSize(100, 40);
   /* try {
      BufferedImage ball = ImageIO.read(new File(getClass().getClassLoader().getResource("beachball.jpg").getFile()));
    } catch (IOException e) {
      e.printStackTrace();
    }*/
    panel.add(fakeball);
    this.setContentPane(panel);
  }

  public void animate() {
    for (;;) {
      Point oldPoint = fakeball.getLocation();
      System.out.println(oldPoint);
      fakeball.setLocation(oldPoint.x, oldPoint.y - 1);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
