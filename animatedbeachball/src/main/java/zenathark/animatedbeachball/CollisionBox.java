package zenathark.animatedbeachball;

import java.awt.*;

public class CollisionBox {
  Point pivot;
  Dimension size;

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
    boolean collisionY = false;
    boolean collisionX = false;
    if ((c.k1.y >= k.k1.y && c.k1.y <= k.k4.y) ||
        (c.k4.y >= k.k1.y && c.k4.y <= k.k4.y)) {
      collisionY = true;
    }
    if ((c.k1.x >= k.k1.x && c.k1.x <= k.k4.x) ||
        (c.k4.x >= k.k1.x && c.k4.x <= k.k4.x)) {
      collisionX = true;
    }
    return collisionX && collisionY;
  }

  class Cajita {
    Point k1;
    Point k2;
    Point k3;
    Point k4;
  }
}
