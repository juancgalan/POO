package test;

public class ModArray implements IModArray {
  private int array[] = {3, 5};

  @Override
  public String getString() {
    return "" + array[0] + "->" + array[1];
  }
}
