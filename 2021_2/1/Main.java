public class Main {
  public static void main(String[] args) {

  }
  public static boolean isDouble(String string) {
    if (string.length() % 2 == 1) return false;
    int midIndex = string.length() / 2;
    int regularIndex = 0;
    while (midIndex < string.length() && string.charAt(regularIndex) == string.charAt(midIndex)) {
      midIndex++;
      regularIndex++;
    }

    return midIndex == string.length();
  }
  public static boolean isDoubleWithSubstring(String string) {
    if (string.length() == 0 || string.length() % 2 == 1) return false;

    String start = string.substring(0, string.length / 2);
    String finish = string.substring(string.length / 2);

    return start.equals(finish);
  }
}
