public class Pencil {
  private int length;
  private boolean sharpened;
  
  public Pencil (int length, boolean sharpened) {
    this.length = length;
    this.sharpened = sharpened;
  }
  public boolean isLonger(Pencil other) {
    return this.length > other.getLength();
  }
  public boolean isSharpened() {
    return this.sharpened;
  }
}
