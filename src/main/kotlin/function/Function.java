package function;

public class Function {

  private int max(int a, int b) {
    if(a > b) {
      return a;
    }
     return b;
  }

  //오버로딩
  private void repeat(String str) {
    repeat(str, 3, true);
  }

  private void repeat(String str, int num) {
    repeat(str, num, true);
  }

  private void repeat(String str, int num, boolean useNewLine) {
    for (int i = 0; i <= num; i++) {
      if (useNewLine) {
        System.out.println(str);
      }else {
        System.out.print(str);
      }
    }
  }

  private void printAll(String... strings) {
    for( String str : strings) {
      System.out.println(str);
    }
  }
}
