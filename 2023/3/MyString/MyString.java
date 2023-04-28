package MyString;

public class MyString {
  private String str;
  public MyString() {
    str = "";
  }
  public int countChar(char ch) {
    int count = 0;

    for (int i = 0; i < this.str.length(); i++) {
      if (this.str.charAt(i) == ch) count++;
    }

    return count;
  }
  public void removeChar(char ch) {
    int startIndex = -1, endIndex = -1;
    
    for (int i = 0; i < this.str.length(); i++) {
      if (this.str.charAt(i) == ch) {
        if (startIndex == -1) startIndex = i;
        endIndex = i;
      }
    }

    this.str = this.str.substring(0, startIndex) + this.str.substring(endIndex + 1, this.str.length() - 1);
  }
  public void appendChar(char ch) {
    this.str = this.str + ch;
  }
  public char firstChar() { return this.str.charAt(0); }
  public boolean isEmpty() { return this.str.length() == 0; }
}
