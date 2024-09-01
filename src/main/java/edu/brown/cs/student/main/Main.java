package edu.brown.cs.student.main;

/** The Main class of our project. This is where execution begins. */
public final class Main {

  /**
   * The initial method called when execution begins.
   *
   * @param args An array of command line arguments
   */
  public static void main(String[] args) {
    new Main(args).run();
  }

  private Main(String[] args) {}

  // TODO: Fix checkstyle errors!
  private void run() {
    System.out.println("Is cs32 the best class?");
          boolean ANSWER = getTruth();
    System.out.println(ANSWER);
  }

  private static boolean getTruth() {
    return true;
  }
}
