package choices;

import java.util.Random;
import static Storage.Var.*;

public class NovaClub {
  public static void novaClub() {
    System.out.println();
    System.out.println("The Nova Club is a place where ship commanders SOCIALIZE, GAMBLE, or BUY exotic goods");
    System.out.println("What will you do?");
    System.out.println();
    String str = sc.nextLine();
    if (str.toLowerCase().equals("socialize") || str.toLowerCase().equals("s")) {
      System.out.println();
      System.out.println("You see many important people in the club, this is the place to be apparently!");
      System.out.println();
      System.out.println("You mingle with the important people at the club.");
      int socialChance = rand.nextInt(1, 4);
      if (socialChance == 1) {
        System.out.println("You make some valuable connections!");
        System.out.println("Territory + 2");
        territory += 2;
      } else {
        System.out.println("Nobody seems interested in talking today.");
      }
    } else if (str.toLowerCase().equals("gamble") || str.toLowerCase().equals("g")) {
      System.out.println();
      System.out.println("You meet a group of fellow commanders betting in the game Cosmic Olympics");
      System.out.println();
      System.out
          .println("A tall lean woman is betting on the JAGUARS, saying they're the fastest Olympians in the galaxy!");
      System.out.println();
      System.out.println("A young commander with a wise look about his face says the SERPENTS will win.");
      System.out.println();
      System.out.println(
          "The other person with a large smile across his face says no doubt the DUCKS will triumph. Their good deeds will come back to them I tell ya");
      System.out.println();
      str = sc.nextLine();
      int winChance = rand.nextInt(1, 4);
      if (str.toLowerCase().equals("serpents") || str.toLowerCase().equals("s")) {
        if (winChance == 1) {
          System.out.println();
          System.out.println(
              "The young commander eyes go big when the serpents win, and the other two grumble and hand over 5 cosmic dust");
          System.out.println("Cosmic Dust + 5");
          System.out.println();
          cd += 5;
        } else {
          System.out.println();
          System.out.println(
              "The young commander sighs when the serpents get eliminated, and the winner holds out their hand");
          System.out.println("Cosmic Dust - 5");
          System.out.println();
          cd -= 5;
        }
      } else if (str.toLowerCase().equals("jaguars") || str.toLowerCase().equals("j")) {
        if (winChance == 1) {
          System.out.println();
          System.out.println(
              "The lean commander eyes go big when the jaguars win, and the other two grumble and hand over 5 cosmic dust");
          System.out.println("Cosmic Dust + 5");
          System.out.println();
          cd += 5;
        } else {
          System.out.println();
          System.out
              .println("The lean commander sighs when the jaguars get eliminated, and the winner holds out their hand");
          System.out.println("Cosmic Dust - 5");
          System.out.println();
          cd -= 5;
        }
      } else if (str.toLowerCase().equals("ducks") || str.toLowerCase().equals("d")) {
        if (winChance == 1) {
          System.out.println();
          System.out.println(
              "The giddy commander eyes go big when the ducks win, and the other two grumble and hand over 5 cosmic dust");
          System.out.println("Cosmic Dust + 5");
          System.out.println();
          cd += 5;
        } else {
          System.out.println();
          System.out
              .println("The giddy commander sighs when the ducks get eliminated, and the winner holds out their hand");
          System.out.println("Cosmic Dust - 5");
          System.out.println();
          cd -= 5;
        }
      }
    } else if (str.toLowerCase().equals("buy") || str.toLowerCase().equals("b")) {
      System.out.println();
      System.out.println(
          "The shopkeeper sees you walk over: Hi! The names Billy Great Shoes and have I got the stuff for you!");
      System.out.println();
      System.out.println(
          "Billy's Rare Finds: (a1) Hermes Sandals (Sneak chance 🔺) : Ancient Miner's Gloves (a2)(Space Pirate Chance )");
      System.out.println();
      System.out.println("What will ya buy? (letter # combination)");
    }
  }
}