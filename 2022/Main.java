public class Main {
  public static void main(String[] args) {
    int[] arr1 = new int[5];
    int[] arr2 = new int[6];
    int[] arr3 = new int[7];
    
    arr1[0] = 3;
    arr1[1] = 0;
    arr1[2] = 1;
    arr1[3] = 4;
    arr1[4] = 2;

    arr2[0] = 1;
    arr2[1] = 2;
    arr2[2] = 5;
    arr2[3] = 1;
    arr2[4] = 3;
    arr2[5] = 4;

    arr3[0] = 3;
    arr3[1] = 4;
    arr3[2] = 1;
    arr3[3] = 5;
    arr3[4] = 6;
    arr3[0] = 0;
    arr3[5] = 2;

    printArray(arr1);
    System.out.println(isPerfect(arr1));
    

    printArray(arr2);
    System.out.println(isPerfect(arr2));
  
    printArray(arr3);
    System.out.println(isPerfect(arr3));
  }
  public static void printArray(int[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%d, ", array[i]);
    }
    System.out.print("]\n");
  }
  public static int[] multiply(int[] arr1, int[] arr2) {
    int[] newArray = new int[Math.max(arr1.length, arr2.length)];
    int i;
    for (i = 0; i < Math.min(arr1.length, arr2.length); i++) newArray[i] = arr1[i] * arr2[i];

    if (arr1.length == newArray.length) {
      for (; i < arr1.length; i++) {
        newArray[i] = arr1[i];
      }
    }
    else if (arr2.length == newArray.length) {
      for (; i < arr2.length; i++) {
        newArray[i] = arr2[i];
      }
    }

    return newArray;
  }
  public static boolean isPerfect(int[] array) {
    boolean[] indexArray = new boolean[array.length];
    int i = array[0];
    
    for (int j = 0; j < indexArray.length; j++) indexArray[j] = false;
    indexArray[0] = true;
    while (i < array.length) {
      if (indexArray[i] == true) return false;
      
      indexArray[i] = true;
      if (array[i] == 0) {
        for (int j = 0; j < indexArray.length; j++) {
          if (indexArray[j] == false) return false;
        }

        return true;
      }
      i = array[i];
    }

    return false;
  }
}
