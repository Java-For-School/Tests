public class Main {
  public static void main(String[] args) {

  }
  public static boolean isEqual(int[] arr, int index) {
    int sum = 0;
    for (int i = index + 1; i < arr.length; i++) {
      sum += arr[i];
    for (int i = index - 1; i >= 0; i--) {
      sum -= arr[i];
    }
    return sum == 0;
  }
  public static boolean hasEqual(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (isEqual(arr, i)) return true;
    }

    return false;
  }
}
