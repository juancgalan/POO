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
  private CollisionBox fakeballCollider;
  private CollisionBox topCollider;
  private CollisionBox bottomCollider;
  private CollisionBox leftCollider;
  private CollisionBox rightCollider;
  private int yDir = -1;
  private int xDir = -1;

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
    fakeball.setLocation(100, 100);
    fakeball.setSize(100, 40);
    fakeballCollider = new CollisionBox(new Point(100, 100),
        new Dimension(100, 40));
    topCollider = new CollisionBox(new Point(0, 0), new Dimension(300,10));
    bottomCollider = new CollisionBox(new Point(0, 290), new Dimension(300,10));
    leftCollider = new CollisionBox(new Point(0, 0), new Dimension(10,300));
    rightCollider = new CollisionBox(new Point(290, 0), new Dimension(10,300));
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
//      System.out.println(oldPoint);
      if (!topCollider.checkCollision(fakeballCollider)) {
        fakeball.setLocation(oldPoint.x, oldPoint.y + yDir * 1);
        fakeballCollider.setPivot(fakeball.getLocation());
      } else {
        yDir *= -1;
        fakeball.setLocation(oldPoint.x, oldPoint.y + yDir * 1);
        fakeballCollider.setPivot(fakeball.getLocation());
      }
      if (!bottomCollider.checkCollision(fakeballCollider)) {
        fakeball.setLocation(oldPoint.x, oldPoint.y + yDir * 1);
        fakeballCollider.setPivot(fakeball.getLocation());
      } else {
        yDir *= -1;
        fakeball.setLocation(oldPoint.x, oldPoint.y + yDir * 1);
        fakeballCollider.setPivot(fakeball.getLocation());
      }
      oldPoint = fakeball.getLocation();
      if (!leftCollider.checkCollision(fakeballCollider)) {
        fakeball.setLocation(oldPoint.x + xDir * 1, oldPoint.y);
        fakeballCollider.setPivot(fakeball.getLocation());
      } else {
        xDir *= -1;
        fakeball.setLocation(oldPoint.x + xDir * 1, oldPoint.y);
        fakeballCollider.setPivot(fakeball.getLocation());
      }
      if (!rightCollider.checkCollision(fakeballCollider)) {
        fakeball.setLocation(oldPoint.x + xDir *1, oldPoint.y);
        fakeballCollider.setPivot(fakeball.getLocation());
      } else {
        xDir *= -1;
        fakeball.setLocation(oldPoint.x + xDir * 1, oldPoint.y);
        fakeballCollider.setPivot(fakeball.getLocation());
      }
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
