package zenathark.calc2;

public class Calculator {
  private static int SUMA = 0;
  private static int RESTA = 1;
  private static int MULT = 2;
  private static int DIV = 3;
  private static int MOD = 4;

  private Double ans = null;
  private Integer op = null;

  public Double getAns() {
    return ans;
  }

  public void choice(double lastNumber) {
    if (this.op == null) {
      this.ans = lastNumber;
    } else {
      if (this.op == SUMA) {
        this.ans += lastNumber;
      } else if (this.op == RESTA) {
        this.ans -= lastNumber;
      } else if (this.op == MULT) {
        this.ans *= lastNumber;
      } else if (this.op ==DIV) {
        this.ans /= lastNumber;
      } else if (this.op ==MOD) {
        this.ans %= lastNumber;
      }
      this.op = null;
    }
  }

  public void choice(String lastOp) {
    if (lastOp.trim().equals("+")) {
      this.op = SUMA;
    } else if (lastOp.trim().equals("-")) {
      this.op = RESTA;
    }else if (lastOp.trim().equals("/")) {
      this.op = DIV;
    }else if (lastOp.trim().equals("*")) {
      this.op = MULT;
    }else if (lastOp.trim().equals("%")) {
      this.op = MOD;
    }
  }
}
