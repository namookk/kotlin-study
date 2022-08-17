package operators;

public class Operators {

  public static void main(String[] args) {
    Money money1 = new Money(2_000L);
    Money money2 = new Money(1_000L);

    if(money1.compareTo(money2) > 0 ) {
      System.out.println("Money1이 Money2보다 금액이 많습니다.");
    }
  }
}
