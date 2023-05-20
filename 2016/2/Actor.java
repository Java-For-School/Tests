public class Actor {
  private String id;
  private String gender;
  private int numFilms;

  public Actor(String id, String gender, int numFilms) {
    this.id = id;
    this.gender = gender;
    this.numFilms = numFilms;
  }

  public int Compare(Actor other) {
    if (this.numFilms > other.getNumFilms()) return 1;
    if (this.numFilms < other.getNumFilms()) return 2;
    return 3;
  }
}
