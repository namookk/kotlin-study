package Type;

public class Type {
  public static void main(String[] args) {
    final int number1 = 3;
    final long number2 = number1;
  }

  public static void printAgeIfPerson(Object obj) {
    if(obj instanceof Person) {
      Person person = (Person) obj;
      System.out.println(person.getAge());
    }
  }
}
