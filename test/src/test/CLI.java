package test;

public class CLI {
  private IModArray array;

  public CLI(IModArray array) {
    this.array = array;
  }

  public void run() {
    System.out.println(array.getString());
  }
}
