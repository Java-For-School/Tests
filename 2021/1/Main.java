public class Main {
  public static void main(String[] args) {
    int[] array = new int[7];
    array[0] = 6;
    array[1] = 9;
    array[2] = 2;
    array[3] = 2;
    array[4] = 9;
    array[5] = 4;
    array[6] = -3;

    printArray(array);
    printArray(filter(array, 9));
  }
  public static void printArray(int[] array) {
    System.out.printf("[");
    for (int i = 0; i < array.length; i++) System.out.printf("%d,", array[i]);
    System.out.printf("]\n");
  }
  public static int[] filter(int[] array, int number) {
    int newLength = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] != number) newLength++;
    }
    int[] newArray = new int[newLength];
    
    for (int i = 0, j = 0; i < array.length; i++) {
      if (array[i] != number) {
        newArray[j] = array[i];
        j++;
      } 
    }

    return newArray;
  }
}
