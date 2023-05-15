public class Main {
  public static void main(String[] args) {

  }
  public static int sickCountInCity(Queue<CovidTest> queue, int cityCode) {
    Queue<CovidTest> temp = new Queue<CovidTest>();
    int count = 0;

    while (!queue.isEmpty()) {
      CovidTest element = queue.remove();
      if (element.getCityCode() == cityCode && element.getSick() == true) count++;
      temp.insert(element);
    }
  }
  public static int mostSick(Queue<CovidTest> queue) {
    Queue<CovidTest> temp = new Queue<CovidTest>();
    int max = 0;
    int maxCityCode = 0;

    while (!queue.isEmpty()) {
      CovidTest element = queue.remove();
      
      int sickInCity = sickCountInCity(queue, element.getCityCode());
      if (sickInCity > max) {
        max = sickInCity;
        maxCityCode = element.getCityCode();
      }
      temp.insert(element);
    }

    return cityCode;
  } 
}
