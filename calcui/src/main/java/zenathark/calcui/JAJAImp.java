package zenathark.calcui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAJAImp implements ActionListener {
  private JLabel label;

  public JAJAImp(JLabel label) {
    this.label = label;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Adiooooos");
    label.setText("Aioooooooos");
  }
}
