public class Race {
  Queue<Competitor> finishers;

  public void add(Competitor x) {
    this.finishers.insert(x);
  }
  public String rank(int x) {
    String name;
    Queue<Competitor> temp = new Queue<Competitor>();
    int i = 1;

    while (!this.finishers.isEmpty()) {
      Competitor competitor = this.finishers.remove();
      if (i == x) name = competitor.getName(); 
      temp.insert(competitor);
    }
    while (!temp.isEmpty) this.finishers.insert(temp.remove();
    return name;
  }
}
