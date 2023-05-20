public class TvWeek {
  private TvProgram[] arrProg;
  private int current;

  public void addProgram(TvProgram program) {
    this.arrProg[this.current] = program;
    this.current++;
  }
  
  public int sportsCount() {
    int count = 0;

    for (int i = 0; i < this.current; i++) {
      if (this.arrProg[i].isSport()) count++;
    }

    return count;
  }
}
