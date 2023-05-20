public class Program {
  public static void main(String[] args) {
    Actor[] actArr = new Actor[37];
  }
  public void getMoreMovies(Actor[] actors, int num) {
    int count = 0;

    for (int i = 0; i < actors.length; i++) {
      if (actors[i].getNumFilms() > num) count++;
    }

    System.out.println(count);
  }
}
