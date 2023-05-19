public class Airport {
  private Flight[] flights;
  
  public boolean isFly() {
    for (int i = 0; i < this.flights.length; i++) {
      if (this.flights[i].getName().equals("Sky")) return true;
    }

    return false;
  }
}
