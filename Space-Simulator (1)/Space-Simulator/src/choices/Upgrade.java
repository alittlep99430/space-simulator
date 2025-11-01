package choices;

import java.util.Random;
import static Storage.Var.*;

public class Upgrade
{
  public static void Upgrade() {
    System.out.println();
    System.out.println("                                                   🪩✨🪩 GALACTIC COSTCO 🪩✨🪩");
    System.out.println();

    System.out.println(
        " 🚀 Bodies: (a1) Explorer Body 5cd  :  (a2) Space Patrol Body 10cd  :  (a3) Assasin Body 15cd  :  (a4) Official Fleet Body 20cd");
    System.out.println();
    System.out.println(" 🔫 Main guns: (b1) Some Randos Guns 5cd  :  (b2) Shabby guns 10cd :  (b3) Cosmic Guns 15cd");
    System.out.println();
    System.out.println(
        "✨ 🔫 ✨ Powered Guns: (c1) Charged gun 5cd :  (c2) Laser Gun 10cd :  (c3) Atomic Blaster 15cd :  (c4) Galactic Supernova 20cd");
    System.out.println();

    System.out.println("✨ 💳 ✨ Exotic Goods: (d1) Nova Club Membership 15cd ");
    System.out.println();

    System.out.println("Choose wisely");
    System.out.println("Choose the letter number combination");
    String str = sc.nextLine();

    if ((str.toLowerCase().equals("explorer body") || str.toLowerCase().equals("a1")) && cd > 4) {
      System.out.println("Nice bod Columbus");
      maxHealth = 6;
      shipBodyName = "Explorer Body";
      cd -= 5;
    } else if ((str.toLowerCase().equals("space patrol body") || str.toLowerCase().equals("a2")) && cd > 9) {
      System.out.println("Nice bod Officer");
      maxHealth = 8;
      shipBodyName = "Space Patrol Body";
      cd -= 10;
    } else if ((str.toLowerCase().equals("Assasin Body") || str.toLowerCase().equals("a3")) && cd > 14) {
      System.out.println("Nice costume John Wick");
      maxHealth = 12;
      shipBodyName = "Assasin Body";
      cd -= 15;
    } else if ((str.toLowerCase().equals("official fleet body") || str.toLowerCase().equals("a4")) && cd > 19) {
      System.out.println("Nice bod Washington");
      maxHealth = 15;
      shipBodyName = "Official Fleet Body";
      cd -= 20;
    } else if ((str.toLowerCase().equals("charged gun") || str.toLowerCase().equals("c1")) && cd > 4) {
      System.out.println("Nice face");
      poweredGuns = 5;
      chargedGunName = "Charged Gun";
      cd -= 5;
    } else if ((str.toLowerCase().equals("laser gun") || str.toLowerCase().equals("c2")) && cd > 9) {
      System.out.println("Nice laser pointer");
      poweredGuns = 7;
      chargedGunName = "Laser Gun";
      cd -= 10;
    } else if ((str.toLowerCase().equals("atomic blaster") || str.toLowerCase().equals("c3")) && cd > 14) {
      System.out.println("Nice bomb korea");
      poweredGuns = 9;
      chargedGunName = "Atomic Blaster";
      cd -= 15;
    } else if ((str.toLowerCase().equals("galactic supernova") || str.toLowerCase().equals("c4")) && cd > 19) {
      System.out.println("Nice sucicide vest");
      chargedGunName = "Galactic Supernova";
      poweredGuns = 12;
      cd -= 20;
    } else if ((str.toLowerCase().equals("some randos guns") || str.toLowerCase().equals("b1")) && cd > 4) {
      System.out.println("Nice gun with snot on it");
      mainGunsName = "Rando's Guns";
      mainGuns = 2;
      cd -= 5;
    } else if ((str.toLowerCase().equals("shabby guns") || str.toLowerCase().equals("b2")) && cd > 9) {
      System.out.println("Nice nerf gun");
      mainGunsName = "Shabby Guns";
      mainGuns = 3;
      cd -= 10;
    } else if ((str.toLowerCase().equals("cosmic guns") || str.toLowerCase().equals("b3")) && cd > 14) {
      System.out.println("Nice Guns");
      mainGunsName = "Cosmic Guns";
      mainGuns = 4;
      cd -= 15;
    } else if ((str.toLowerCase().equals("nova club membership") || str.toLowerCase().equals("d1")) && cd > 14) {
      System.out.println("Wow you elitist");
      novaClub = true;
      novaClubString = "💳 Nova Club";
      cd -= 15;
    } else {
      System.out.println("You'll have to expand your wallet bud...");
    }
  }
}