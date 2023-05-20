public class Country {
  private String countryName;
  private Game[] games;

  public Country(String countryName) {
    this.countryName = countryName;
    this.games = new Game[43];
  }

  public boolean participates(String gameName) {
    for (int i = 0; i < this.games.length; i++) {
      if (this.games[i].getGameName().equals(gameName)) return true;
    }
    return false;
  } 
}
