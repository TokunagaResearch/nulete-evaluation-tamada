class GrandTotal {
  void run(String[] args) {
    Integer sum = 0;
    Integer start = 1;
    Integer end = 10;

    if (args.length > 0) {
      end = Integer.valueOf(args[0]);
    }

    for (Integer i = start; i <= end; i++) {
      sum = i;
    }

    System.out.printf("%dから%dまでの総和は%dです\n", start, end, sum);
  }

  public static void main(String[] args) {
    new GrandTotal().run(args);
  }
}
