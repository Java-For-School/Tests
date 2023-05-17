public class Main {
  public static void main(String[] args) {

  }
  public static int[] doubleSum(Flashlight[] arr, double total, int beginScan) {
    boolean isFound = false;
    int[] indexes = new int[2];
    indexes[0] = -1;
    indexes[1] = -1;
    
    for (int i = beginScan; i < arr.length - 1; i++) {
      if (!isFound) {
        for (int j = i + 1; j < arr.length; j++) {
          if (arr[i].getPrice() + arr[j].getPrice() == total) {
            isFound = true;
            indexes[0] = i;
            indexes[1] = j;
          }
        }
      }
    }

    return indexes;
  }

  public static int[] tripleSum(Flashlight[] arr, double total) {
    boolean isFound = false;
    int[] indexes = new int[3];
    indexes[0] = -1;
    indexes[1] = -1;
    indexes[2] = -1;

    for (int i = 0; i < arr.length - 2; i++) {
      if (!isFound) {
        int[] firstTwoIndexes = doubleSum(arr, total - arr[i].getPrice(), i + 1);
        if (firstTwoIndexes[0] != -1 && firstTwoIndexes[1] != -1) {
          indexes[0] = i;
          indexes[1] = firstTwoIndexes[0];
          indexes[2] = firstTwoIndexes[1];
        }
      }
    }

    return indexes; 
  }
  public static void threeFlashlights(Flashlight[] arr, double total) {
    int[] indexes = tripleSum(arr, total);
    if (indexes[0] != -1 && indexes[1] != -1 && indexes[2] != -1) {
      System.out.println(arr[indexes[0]].getName());
      System.out.println(arr[indexes[1]].getName());
      System.out.println(arr[indexes[2]].getName());
    }
  }
}
