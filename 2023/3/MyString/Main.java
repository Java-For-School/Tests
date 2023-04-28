public class Main {
  public static void main(String[] args) {

  }
  public static MyString special(MyString ms) {
    MyString string = new MyString();

    while (!ms.isEmpty()) {
      string.append(ms.firstChar().repeat(ms.countChar(ms.firstChar())));
      ms.removeChar(ms.firstChar());
    }
  }
}
