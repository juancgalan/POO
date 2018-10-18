package test;

public class LinkArray implements IModArray {
  private double array[] = {7.5, 3.5};

  @Override
  public String getString() {
    return array[0] + "->" + array[1];
  }
}
