class Fibonacci {
  void run(String[] args) {
    Integer to = 20;

    if (args.length > 0) {
      to = Integer.valueOf(args[0]);
    }

    Integer prev1 = 1;
    Integer prev2 = 1;

    for (Integer i = 1; i <= to; i++) {
      Integer item = prev1 + prev2;
      prev2 = prev1;
      prev1 = item;
      System.out.print(item);
      System.out.print(" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    new Fibonacci().run(args);
  }
}
