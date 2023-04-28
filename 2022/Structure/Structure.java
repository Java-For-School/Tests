package Structure;

public class Structure {
  Pixel[] arr;

  public boolean isBalanced() {
    int red = 0;
    int green = 0;
    int blue = 0;
    
    for (int i = 0; i < this.arr.length; i++) {
      if (this.arr[i].isRed()) red++;
      if (this.arr[i].isGreen()) green++;
      if (this.arr[i].isBlue()) blue++;
    }

    return (red == green && green == blue);
  }
  public boolean isBlackAndWhite() {
    boolean isThereBlack = false;
    boolean isThereWhite = false;

    for (int i = 0; i < this.arr.length; i++) {
      if (this.arr[i].isBlack() == true) isThereBlack = true;
      if (this.arr[i].isWhite() == true) isThereWhite = true;
      if (this.arr[i].isBlack() == false && this.arr[i].isWhite() == false) return false;
    }

    return true;
  }
}
