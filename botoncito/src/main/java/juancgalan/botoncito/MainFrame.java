package juancgalan.botoncito;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

  {
    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public MainFrame() {
    super();
    init();
  }

  /**
   * Initialization of GUI elements
   */
  private void init() {
    FlowLayout layout = new FlowLayout();
    JPanel panel = new JPanel(layout);
    final JFrame parentFrame = this;
    JButton changeColorBtn = new JButton();
    changeColorBtn.addActionListener((e) -> {
        int r = randomChannel();
        int g = randomChannel();
        int b = randomChannel();
        parentFrame.getContentPane().setBackground(new Color(r, g, b));
        
    });
    changeColorBtn.setOpaque(false);
    changeColorBtn.setContentAreaFilled(false);
    changeColorBtn.setBorderPainted(false);
    changeColorBtn.setPreferredSize(new Dimension(300, 300));
    panel.add(changeColorBtn);
    this.setContentPane(panel);
  }

  private int randomChannel() {
    return (int) (Math.random() * 255);
  }
}
