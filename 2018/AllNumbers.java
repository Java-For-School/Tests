public class AllNumbers {
  private int[] arrayNum;
  
  public int lastOddValue() {
    int i = this.arrayNum.length - 1;
    int num = this.arrayNum[i];

    while (i >= 0 && num % 2 == 0) {
      i--;
      num = this.arrayNum[i];
    }
    
    return num;
  } 
}
