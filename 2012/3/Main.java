public class Main {
  public static RealSet clone(RealSet rs) {
    RealSet newRs = new RealSet();
    RealSet temp = new RealSet();

    for (int i = 0; i < rs.size(); i++) {
      double element = rs.findBiggest();
      newRs.insert(element);
      temp.insert(element);
      rs.remove(element);
    }


    for (int i = 0; i < temp.size(); i++) {
      double element = temp.findBiggest();
      rs.insert(element);
      temp.remove(element);
    }

    return newRs;
  }

  public static RealSet buildNeg(RealSet rs) {
    RealSet newRs = new RealSet();
    RealSet temp = clone(rs);
    
    for (int i = 0; i < temp.size(); i++) {
      double element = temp.findBiggest();
      if (element < 0) newRs.insert(element);
      temp.remove(element);
    }

    return newRs;
  }
}
