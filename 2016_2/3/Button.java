public class Button {
  private int num;
  private int size;
  private String color;

  public Button(int num) {
    this.num = num;
    this.size = 5;
    this.color = "black";
  }

  public void addToSize(int x) {
    this.size += x;
  }

  public boolean isSameSize(Button other) {
    return (this.size() == other.getSize());
  }
}
