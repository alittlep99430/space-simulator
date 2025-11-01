import static Storage.Var.*;
import Storage.*;
import java.util.*;
import java.util.Random;
import choices.Explore;
import choices.Attack;
import choices.Mine;
import choices.NovaClub;
import choices.Upgrade;

// This is a SpaceExplorers 

public class Main {

  public static void main(String[] args) {

    // intro
    
    System.out.println();
    System.out.println("Hello, welcome to SpaceExplorers!");
    System.out.println();
    System.out.println("You just graduated from the acadamy and bought your first ship!");

    System.out.println();
    System.out.println("Captain, what is your name?");

    String abc = sc.nextLine();
    name1 = abc;

    System.out.println();
    System.out.println("Greetings " + name1 + "! Your destiny awaits you!");

    isDone = true;

    // while
    while (isDone == true) {

      if (territory >= 75) {
        System.out.print("You Won!!!!!!!! Congragulations, you'll go down in galatic history!");
        System.exit(0);
      }

      // Reseting Variables
      health = maxHealth;
      fightDone = false;
      // Used to progressivley make it harder on the player as they gain territory
      // banditHealth = 4 + (territory/10);
      // banditMainGuns = 1 + (territory/10);
      // banditPoweredGun = 2 + (territory/5);

      Status.displayStatus();

      String str = sc.nextLine();

      if (str.toLowerCase().equals("explore") || str.toLowerCase().equals("e")) {
        int exploreChance = rand.nextInt(1, 2);
        if (exploreChance == 1) {
          Explore.planet();
        } else {
          Explore.distressShip();
        }
      }

      if (str.toLowerCase().equals("mine") || str.toLowerCase().equals("m")) {
        Mine.mine();
      }

      if ((str.toLowerCase().equals("nova club") || str.toLowerCase().equals("nc")) && novaClub == true) {
        NovaClub.novaClub();
      }

      if (str.toLowerCase().equals("upgrade") || str.toLowerCase().equals("u")) {
        Upgrade.Upgrade();
      }

      if (str.toLowerCase().equals("fight") || str.toLowerCase().equals("f")) {
        System.out.println();
        System.out.println("You spot a ship, it looks like it has been sitting around for a while");
        System.out.println();
        System.out.println(
            "Will you SNEAK (2xdmg & two turns, but if you fail to sneak, you are shot automatically) up on it, or WALK right up to it?");
        str = sc.nextLine();
        // In case of walkin
        if (str.toLowerCase().equals("walk") || str.toLowerCase().equals("w")) {
          Attack.PlayerAttack();
        }
        // In case of sneaking
        if (str.toLowerCase().equals("sneak") || str.toLowerCase().equals("s")) {
          Attack.sneakAttack();
        }
      }

    }
  }
}

  // public static String ESC = "\u001B";
  // static String GS = "\u001D";
  // static String InitializePrinter = ESC + "@";
  // static String BoldOn = ESC + "E" + "\u0001";
  // static String BoldOff = ESC + "E" + "\0";
  // static String DoubleOn = GS + "!" + "\u0011"; // 2x sized text (double-high +
  // double-wide)
  // static String DoubleOff = GS + "!" + "\0";