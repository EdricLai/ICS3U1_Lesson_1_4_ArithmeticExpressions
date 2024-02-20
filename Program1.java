class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    // Day Age Calculator
    int intAge;
    int intDays;

    intAge = readInt("How old are you? ");
    intDays = intAge * 365;

    System.out.print("You have been alive for this many days: ");
    System.out.println(intDays);
  }
}
