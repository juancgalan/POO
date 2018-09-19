package zenathark.jcalc;

import javax.swing.*;
import java.awt.*;

public class CalcGui extends JFrame {
  private JPanel mainPanel;
  private JTextField displayTField;
  private JButton plusBtn;
  private JButton minusBtn;
  private JButton multBtn;
  private JButton divBtn;
  private JButton modBtn;
  private JButton eqBtn;

  {
    initUI();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  private void initUI() {
    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc;
    mainPanel = new JPanel(gbl);

    displayTField = new JTextField();
    displayTField.setColumns(20);
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 4;
    mainPanel.add(displayTField, gbc);

    plusBtn = new JButton("+");
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 2;
    gbc.gridwidth = 1;
    mainPanel.add(plusBtn, gbc);

    minusBtn = new JButton("-");
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 3;
    gbc.gridwidth = 1;
    mainPanel.add(minusBtn, gbc);

    multBtn = new JButton("*");
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 4;
    gbc.gridwidth = 1;
    mainPanel.add(multBtn, gbc);
    gbc = new GridBagConstraints();

    divBtn = new JButton("/");
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 5;
    gbc.gridwidth = 1;
    mainPanel.add(divBtn, gbc);

    modBtn = new JButton("%");
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 6;
    gbc.gridwidth = 1;
    mainPanel.add(modBtn, gbc);

    eqBtn = new JButton("=");
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 7;
    gbc.gridwidth = 1;
    mainPanel.add(eqBtn, gbc);
    this.add(mainPanel);
  }
}
