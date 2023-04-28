package Range;

public class Range {
  private int low;
  private int high;

  public int getLow() { return this.low; }
  public int getHigh() { return this.high; }

  public void setLow(int low) { this.low = low; }
  public void setHigh(int high) { this.high = high; }

  public boolean isInRange(int number) { return number <= this.high && number >= low; }
}

