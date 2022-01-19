class Factorial {
  void run(String[] args) {
    Integer number = 5;

    if (args.length > 0) {
      number = Integer.valueOf(args[0]);
    }

    Integer factorial = 0;

    for (Integer i = 1; i <= number; i++) {
      factorial *= i;
    }

    System.out.printf("%d! = %d\n", number, factorial);
  }

  public static void main(String[] args) {
    new Factorial().run(args);
  }
}
