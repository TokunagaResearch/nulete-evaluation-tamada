class LeapYear {
  void run(String[] args) {
    Integer year = 2022;

    if (args.length > 0) {
      year = Integer.valueOf(args[0]);
    }

    Boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

    if (isLeapYear) {
      System.out.printf("%d年はうるう年です\n", year);
    } else {
      System.out.printf("%d年はうるう年ではありません\n", year);
    }
  }

  public static void main(String[] args) {
    new LeapYear().run(args);
  }
}
