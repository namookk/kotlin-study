package operators;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public class Money implements Comparable<Money>{

  private Long amount;

  public Money(Long amount) {
    this.amount = amount;
  }

  @Override
  public int compareTo(@NotNull Money o) {
    return Long.compare(amount, o.amount);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Money money = (Money) o;
    return Objects.equals(amount, money.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }
}
