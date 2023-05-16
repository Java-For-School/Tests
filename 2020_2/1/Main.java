public class Main {
  public static void main(String[] args) {
    Pencil pencil1 = new Pencil(12, true);
    Pencil pencil2 = new Pencil (13, false);
    if (pencil1.isLonger(pencil2) && pencil1.isSharpened ()) 
      System.out.println ("I choose pencil1");
    else {
      if (pencil2.isSharpened ()) 
        System.out.println ("I choose pencil2");
    else
      System.out.println ("pencil2 needs to be sharpened");
    }
  }
  // Output: pencil2 needs to be sharpened
}
