package zenathark.calc2;

import javafx.beans.binding.NumberBinding;

import java.util.Scanner;

public class CalculatorCLI {

  private Calculator calculator;

  public CalculatorCLI() {
    calculator = new Calculator();
  }

  public void run() {
    for (;;) {
      String input = read();
      update(input);
      System.out.println(calculator.getAns());
    }
  }

  public String read() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input?");
    String input = scanner.next();
    while (!validateInput(input)) {
      System.out.println("Invalid input.");
      System.out.print("Input?");
      input = scanner.next();
    }
    return input;
  }

  public void update(String input) {
    try {
      double val = Double.parseDouble(input);
      calculator.choice(val);
    } catch (NumberFormatException e) {
      calculator.choice(input);
    }
  }

  public boolean validateInput(String input) {
    try {
      Double.parseDouble(input);
      return true;
    } catch (NumberFormatException e) {
      if ("+-/*%".indexOf(input.trim().charAt(0)) >= 0) {
        return true;
      }
      return false;
    }
  }


}
