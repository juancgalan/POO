package zenathark.jcalc;

import javax.swing.*;
import java.awt.*;

public class AdvCalcGui extends JFrame {
  final private JTextField displayTField;
  final private ICalculator calc;

  {
    displayTField = new JTextField();
    initUI();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public AdvCalcGui(ICalculator calc) {
    this.calc = calc;
  }

  private void initUI() {
    GridBagLayout gbl = new GridBagLayout();
    JPanel mainPanel = new JPanel(gbl);
    GridBagConstraints gbc;

    displayTField.setColumns(24);
    displayTField.setEditable(false);
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 4;
    mainPanel.add(displayTField, gbc);

    int i = 1;
    for (String c: "+-*/%=".split("")) {
      addButton(mainPanel, 3, i, c);
      i++;
    }

    for (int j = 1; j < 10; j++) {
      int x = (j - 1) % 3;
      int y = 3 - (j - 1) / 3;
      addNumberButton(mainPanel, x, y, Integer.toString(j));
    }

    addNumberButton(mainPanel, 1, 4, "0");

    this.add(mainPanel);
  }

  private void addButton(JPanel panel, int x, int y, String label) {
    JButton btn = new JButton(label);
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = x;
    gbc.gridy = y;
    gbc.gridwidth = 1;
    btn.addActionListener(i -> {
      String currentText = displayTField.getText();
      calc.push(currentText);
    });
    panel.add(btn, gbc);
  }

  private void addNumberButton(JPanel panel, int x, int y, String label) {
    JButton btn = new JButton(label);
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = x;
    gbc.gridy = y;
    gbc.gridwidth = 1;
    btn.addActionListener(i -> {
      String currentText = displayTField.getText();
      displayTField.setText(currentText + label);
    });
    panel.add(btn, gbc);
  }
}
