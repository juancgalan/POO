package zenathark.calcui;

import javax.swing.*;
import java.awt.*;

public class CalcGUI extends JFrame {

  {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300, 300);
    this.init();
  }

  private void init() {
    FlowLayout layout = new FlowLayout();
    JLabel label = new JLabel("Hello, World");
    JButton btn = new JButton("JAJA");
    btn.addActionListener(new JAJAImp(label));
    JButton btn1 = new JButton("JAJA2");
    JPanel panel = new JPanel(layout);

    panel.add(btn);
    panel.add(label);
    panel.add(btn1);
    this.add(panel);
  }
}
