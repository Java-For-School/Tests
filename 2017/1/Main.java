public class Main {
  public static void main(String[] args) {

  }
  public static int big(int[] arr) {
    int index = 0;
    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr[index]) index = i;
    }

    return index;
  }
}
