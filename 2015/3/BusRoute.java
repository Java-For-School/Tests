class BusRoute {
  private Station[] busStations;

  public BusRoute(Station first, Station second) {
    this.busStations = new Station[2];
    this.busStations[0] = first;
    this.busStations[1] = second;
  }

  public void addStation(Station newStation) {
    Station[] newStationArray = new Station[this.busStation.length + 1];

    for (int i = 0; i < this.busStations.length; i++) newStationArray[i] = this.busStation[i];

    this.busStations = newStationArray;
  }

  public double routeLength() {
    double sum = 0;

    for (int i = 0; i < this.busStations.length - 1; i++) {
      sum += this.busStations[i].distance(this.busStations[i + 1]); 
    }

    return sum;
  }
}
