public class Main {
  public static boolean jumpNum(int num) {
    boolean last = (num % 10) % 2 == 0;

    while (num > 0) {
      boolean current = (num % 10) % 2 == 0;
      if (current == last) return false;
      last = current; 
    }

    return true;
  }

  public static void jumpArr(int[] arr) {
    int[] newArr = new int[arr.length]; 
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (jumpNum(arr[i])) {
        newArr[index] = arr[i];
        index++;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (!jumpNum(arr[i])) {
        newArr[index] = arr[i];
        index++;
      }
    }

    for (int i = 0; i < arr.length; i++) arr[i] = newArr[i];
  }
}
