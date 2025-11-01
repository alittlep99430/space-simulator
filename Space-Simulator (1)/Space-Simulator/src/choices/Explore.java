package choices;

import java.util.Random;
import static Storage.Var.*;

import java.awt.GridLayout;

public class Explore
{
  public static void planet() {
    System.out.println();
    System.out.println(" As your ship explores a new unknown area, you find a planet off the charts of the official database. It's surface is a mix of colors primarily dark green, with oceans surrounding the colorful rainforests");
    System.out.println("Will you LAND, or send a SIGNAL to the planet?");
    String str = sc.nextLine();
    if (str.toLowerCase().equals("land") || str.toLowerCase().equals("l")) {

    } else if (str.toLowerCase().equals("signal") || str.toLowerCase().equals("s")) {
      
    }

  }
  
  public static void distressShip() {
    System.out.println();
    System.out.println("As your ship flies through the galaxy, you get a distress signal. As you approach the ship you see a wierdly shaped astroid");
    System.out.println("Will your REPAIR the ship or INVESTIGATE the astroid?");
    String str = sc.nextLine();
    if (str.toLowerCase().equals("repair") || str.toLowerCase().equals("r")) {
      System.out.println();
      System.out.println("The ship radios you: Help!!! Our ship is beyond repair! Let us board you before the *&&*^(*&^ comes back!!");
      System.out.println("Will you let them BOARD you or QUESTION them?");
      str = sc.nextLine();
      if (str.toLowerCase().equals("board") || str.toLowerCase().equals("b")) {
        System.out.println();
        System.out.println("You extend the bridge and hope they're not pirates...");
        System.out.println();
        System.out.println(
            "As they walk across the bridge you see they're a few astroid mining workers! They thank you and give you a comic dust for your troubles");
        System.out.println("Cosmic Dust + 5");
        cd += 5;
        System.out.println();
        System.out.println(
            "Suddenly, you see the astroid moving toward the abandoned ship! The astroid seems to open up and devour the ship");
        System.out.println();
        System.out.println("Your ship jumps to lightspeed and never sees the astroid again, wierd huh?");
      } else if (str.toLowerCase().equals("question") || str.toLowerCase().equals("q")) {
        System.out.println();
        System.out.println("You question them: Which alliance are you From?");
        System.out.println();
        System.out.println("Theres no time!!");
        System.out.println();
        System.out.println(
            "Suddenly, you see the astroid moving toward the occupied ship! The astroid seems to open up with tenticle like teeth that devour the ship");
        System.out
            .println("Your ship jumps to lightspeed and never sees the astroid again. A failed mission, tis a sad day");
      }
    } else if (str.toLowerCase().equals("investigate") || str.toLowerCase().equals("i")) {
      System.out.println();
      System.out.println("As you inch closer to the astroid, you swear you see the astroid breathing...");
      System.out.println("Will you come CONTINUE your investigation or SHOOT the astorid?");
      str = sc.nextLine();
      if (str.toLowerCase().equals("continue") || str.toLowerCase().equals("c")) {
        System.out.println();
        System.out.println(
            "Two yellow large dialated eyes blink at you. It would almost be cute if it wasn't sucking you into their mouth...");
        System.out.println(
            "Your now in the stomach of an astroid, what do you do? Will you use your CHARGED gun or SIT on it? ");
        str = sc.nextLine();
        if (str.toLowerCase().equals("charged") || str.toLowerCase().equals("c")) {
          System.out.println();
          System.out.println("You use your charged guns and split the astroid open, taking the distress ship with it");
          System.out.println("A failed mission, but at least you got out with your lives!");
        } else if (str.toLowerCase().equals("sit") || str.toLowerCase().equals("s")) {
          System.out.println();
          System.out.println("You think on it for an hour, and by that time your completely digested and out the bod");
          System.out.println("Your ship feels like it got a car wash");
          System.out.println("Health + 3");
          System.out.println("Cosmic Dust + 5");
          maxHealth += 3;
          cd += 5;
        }
      } else if (str.toLowerCase().equals("shoot") || str.toLowerCase().equals("s")) {
        System.out.println();
        System.out.println("You shoot the astroid and it squeels in pain, shaking your ship like an earthquake...");
        System.out.println("The astroid shoots away and you save the distressed ship!");
        System.out.println("Cosmic Dust + 5");
        cd += 5;
      }
    }

  }
}