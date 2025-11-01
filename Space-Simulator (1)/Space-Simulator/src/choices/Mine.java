package choices;

import java.util.Random;
import static Storage.Var.*;

public class Mine
{
  public static void mine() {
    System.out.println();
    System.out.println("Astroid mining is the economy of the galaxy!");
    System.out.println(" Astroid Mining is also a dangerous job though, so watch your back for pirates!");
    System.out.println();
    System.out.println();
    System.out.println("Your ship can reach the mines of Morian Currently");

    System.out.println();
    System.out.println("Will you RIGOROUS mine or mine like a NORMIE");

    String str = sc.nextLine();

    if (str.toLowerCase().equals("rigorous") || str.toLowerCase().equals("r")) {

      if (rand.nextInt(1, 4) == 1) {
        System.out.println();
        System.out.println("The space pirates hear your raucous mining and steal your Cosmic Dust");
        System.out.println("Better luck next time!");
        System.out.println("Cosmic Dust -1");
        System.out.println();
        cd -= 1;
      } else {
        cd += rand.nextInt(2, 5);
        System.out.println("Gud finds " + name1);
      }
    } else if (str.toLowerCase().equals("normie") || str.toLowerCase().equals("n")) {
      cd += rand.nextInt(1, 3);
      System.out.println("Mid finds " + name1);
    }
  }
}