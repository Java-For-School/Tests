public class Main {
  public static void main(String[] args) {

  }
  public static int above(int[] arr, int num) {
    int sum = 0;
    int i = 0;
    while (sum < arr[i] && i < arr.length) {
      sum += arr[i];
      if (sum > num) return i;
      i++;
    }
    return -1;
  }
}
