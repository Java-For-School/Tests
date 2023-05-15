public class Main {
  public static void main(String[] args) {

  }
  public static boolean isCorner(int[][] arr) {
    for (int level = 1; level <= arr.length; level++) {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i][level - 1] != level) return false;
      }
      for (int i = level - 1; i < arr.length; i++) {
        if (arr[level - 1][i] != level) return false;
      }
    }
    return true;
  }
}
