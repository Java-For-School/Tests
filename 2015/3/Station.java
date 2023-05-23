class Station {
  private int x;
  private int y;

  public Station(int x, int y) {
    this.x = x;
    this.y = y;
  }

  double distance(Station other) {
    return Math.sqrt(Math.pow(this.x - other.getX(), 2) + Math.pow(this.y - other.getY(), 2));
  }
}
