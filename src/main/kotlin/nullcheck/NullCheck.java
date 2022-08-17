package nullcheck;

public class NullCheck {

  public boolean startsWithA1(String str) {
    if(str == null) {
      throw new IllegalArgumentException("null");
    }
    return str.startsWith("A");
  }

  public Boolean startsWithA2(String str) {
    if(str == null){
      return null;
    }
    return str.startsWith("A");
  }

  public boolean startsWithA3(String str) {
    if(str == null) {
      return false;
    }
    return str.startsWith("A");
  }
}
