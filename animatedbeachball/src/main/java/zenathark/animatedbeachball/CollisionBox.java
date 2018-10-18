package zenathark.animatedbeachball;

import java.awt.*;

public class CollisionBox {
  private Point pivot;
  private Dimension size;


  public void setPivot(Point pivot) {
    this.pivot = pivot;
  }

  public Point getPivot() {
    return pivot;
  }

  public CollisionBox(Point pivot, Dimension size) {
    this.pivot = pivot;
    this.size = size;
  }

  public Cajita getCajita() {
    Cajita ans = new Cajita();
    ans.k1 = pivot;
    ans.k2 = new Point(ans.k1.x + size.width, ans.k1.y);
    ans.k4 = new Point(ans.k1.x, ans.k1.y + size.height);
    ans.k3 = new Point(ans.k2.x, ans.k4.y);
    return ans;
  }

  public boolean checkCollision(CollisionBox otherBox) {
    Cajita k = getCajita();
    Cajita c = otherBox.getCajita();
    System.out.println(k);
    System.out.println(c);

    boolean collisionY = false;
    boolean collisionX = false;
    if ((Math.abs(c.k1.y) >= Math.abs(k.k1.y) && Math.abs(c.k1.y) <= Math.abs(k.k4.y)) ||
        (Math.abs(c.k4.y) >= Math.abs(k.k1.y) && Math.abs(c.k4.y) <= Math.abs(k.k4.y))) {
      System.out.println("Y Collision!!");
      collisionY = true;
    }
    if ((c.k1.x >= k.k1.x && c.k1.x <= k.k2.x) ||
        (c.k2.x >= k.k1.x && c.k2.x <= k.k2.x)) {
      collisionX = true;
    }
    return collisionX && collisionY;
  }

  class Cajita {
    Point k1;
    Point k2;
    Point k3;
    Point k4;

    @Override
    public String toString() {
      return "k1:[" + printPoint(k1) + " k2:" + printPoint(k2)
          +" k3:" + printPoint(k3) +" k4:" + printPoint(k4);
    }

    public String printPoint(Point p) {
      return "x:" + p.x + " y:" + p.y;
    }
  }
}
