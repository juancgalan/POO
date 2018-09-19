package juancgalan.botoncito;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickMeListener implements ActionListener {
  private MainFrame parent;

  public ClickMeListener(MainFrame aParent) {
    parent = aParent;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    parent.getContentPane().setBackground(Color.BLUE);
  }
}
