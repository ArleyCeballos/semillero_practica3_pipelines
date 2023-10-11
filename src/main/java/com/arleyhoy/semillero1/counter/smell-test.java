public class BadCode {

  public static void main(String[] args) {
      int a = 5;
      int b = 10;
      badMethod(a, b);
  }

  public static void badMethod(int x, int y) {
      if (x > y) {
          System.out.println("x is greater");
          if (x < 100) {
              if (y < 50) {
                  System.out.println("y is small");
              } else if (y > 100) {
                  System.out.println("y is big");
              } else {
                  if (x + y > 100) {
                      System.out.println("sum is big");
                  } else {
                      System.out.println("sum is small");
                  }
              }
          } else {
              System.out.println("x is big");
          }
      } else if (x < y) {
          System.out.println("y is greater");
      } else {
          System.out.println("x and y are equal");
          for (int i = 0; i < 10; i++) {
              for (int j = 0; j < 10; j++) {
                  System.out.println(i * j);
              }
          }
      }
      badMethod2();
  }

  public static void badMethod2() {
      int a = 5;
      int b = 10;
      int c = a + b;
      System.out.println(c);
      System.out.println("Bad method finished");
  }
}