public class Dice {
  private int north;
  private int west;
  private int top;

  public Dice(int north, int west, int top) {
    this.north = north;
    this.west = west;
    this.top = top;
  }

  public void rollRight() {
    int temp = top;
    top = west;
    west = 7 - temp;
  }

  public void rollDown() {
    int temp = top;
    top = north;
    north = 7 - temp;
  }

  public int getTop() {
    return top;
  }
}

