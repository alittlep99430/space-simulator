package choices;

import java.util.Random;
import java.util.Scanner;
import static Storage.Var.*;

public class Attack
{
  public static void banditAttack() {
    int mainPowered = rand.nextInt(1, 3);
    System.out.println(mainPowered);
    if (mainPowered > 1) {
      int mainGun = rand.nextInt(1, 11);
      if (mainGun > 2) {
        System.out.println();
        int shipDamage = rand.nextInt(1,5);
        if (shipDamage == 1) {
          System.out.println("The ship shoots back! A miracle!");
          System.out.println("‼️‼️‼️ WARNING, HULL IS DAMAGED‼️‼️‼️");
        } else if (shipDamage == 2) {
          System.out.println("The ship shoots back! A miracle!");
          System.out.println("‼️‼️‼️ WARNING, ENGINES are DAMAGED ‼️‼️‼️");
        } else if (shipDamage == 3) {
          System.out.println("The ship shoots back! A miracle!");
          System.out.println("‼️‼️‼️ WARNING, STERN IS DAMAGED ‼️‼️‼️");
        } else {
          System.out.println("The ship shoots back! A miracle!");
          System.out.println("‼️‼️‼️ WARNING, DECK IS DAMAGED ‼️‼️‼️");
        }
        health -= banditMainGuns;
        if (health <= 0) {
          System.out.println();
          System.out.print("You lost sucka");
          System.exit(0);
        }
      } else {
        System.out.println();
        System.out
            .println("The ship shoots back! A series of blasts hit the nearby planet. Hell, these guys are serious!");
      }
    } else {
      int poweredGun = rand.nextInt(1, 11);
      if (poweredGun > 4) {
        System.out.println();
        int shipDamage = rand.nextInt(1,5);
        if (shipDamage == 1) {
          System.out.println("The ship shoots back! A miracle!");
          System.out.println("‼️‼️‼️ WARNING, HULL IS SEVERELY DAMAGED‼️‼️‼️");
        } else if (shipDamage == 2) {
          System.out.println("The ship shoots back! A miracle!");
          System.out.println("‼️‼️‼️ WARNING, ENGINES are SEVERELY DAMAGED ‼️‼️‼️");
        } else if (shipDamage == 3) {
          System.out.println("The ship shoots back! A miracle!");
          System.out.println("‼️‼️‼️ WARNING, STERN IS SEVERELY DAMAGED ‼️‼️‼️");
        } else {
          System.out.println("The ship shoots back! A miracle!");
          System.out.println("‼️‼️‼️ WARNING, DECK IS SEVERELY DAMAGED ‼️‼️‼️");
        }
        health -= banditPoweredGun;
        if (health <= 0) {
          System.out.println();
          System.out.print("You lost sucka");
          System.exit(0);
        }
      } else {
        System.out.println();
        System.out
            .println("The ship shoots back! A beam of light hits the nearby planet. Hell, these guys are serious!");
      }
    }
  }


  
  public static void PlayerAttack() {
    while (fightDone == false){
          System.out.println();
          System.out.println(" 🔳🔷🔳🔳⭕⭕🔳🔶🔶🔶🔳⭕⭕🔳🔳🔷🔳 ");
          System.out.println();
          System.out.println("            Health: " + health);
          System.out.println();
          System.out.println("         Bandit Health: " + banditHealth);
          System.out.println();
          System.out.println("Captain, what weapon do you choose?");
          System.out.println();
          System.out.println("🔫 (M) " + mainGunsName + ": " + mainGuns + " dmg 80% chance to hit");
          System.out.println("✨ 🔫 ✨ (C) " + chargedGunName + ": " + poweredGuns + " dmg 60% chance to hit");
          System.out.println("💨 FLEE: 75% chance");
          System.out.println();
          System.out.println(" 🔳🔷🔳🔳⭕⭕🔳🔶🔶🔶🔳⭕⭕🔳🔳🔷🔳 ");
          System.out.println();
    
          String str = sc.nextLine();

          if (str.toLowerCase().equals("flee") || str.toLowerCase().equals("f")){
            int fleeChance = rand.nextInt(1,13);
            if (fleeChance > 3) {
              System.out.println("Ya escape and live to fight anotha day!");
              fightDone = true;
            } else {
              System.out.println("Ya get hit a little");
              System.out.println("Health - " + banditMainGuns);
              fightDone = true;
            }
          }
          
          if (str.toLowerCase().equals("main") || str.toLowerCase().equals("m")) {
            int mainHitChance = rand.nextInt(1,11);

    // In case of using the main guns successively  
                
            if (mainHitChance > 2){
              System.out.println();
              System.out.println("Your main guns bombard the ships hull causing a chain effect of explosions");
              banditHealth -= mainGuns;
              
              if (banditHealth <= 0) {
                  fightDone = true;
                  territory += 5;
                  System.out.println();
                  System.out.println();
                  System.out.println("You beat the ship and gained some territory!");
                  System.out.println("Territory + 5");
                
                  banditHealth = 4 + (territory/10);
                  banditMainGuns = 1 + (territory/10);
                  banditPoweredGun = 2 + (territory/5);
                
                } else {
                    banditAttack();
                }
              } else {     // In case of using the main guns and failing   
                  System.out.println();
                  System.out.println("Your main guns aren't callibrated and fire at an astroid. It explodes in half and goes into the planets atmosphere");
                  banditAttack();
            }
                // In case of using the Pulsator gun
        } else if (str.toLowerCase().equals("charged") || str.toLowerCase().equals("c")){
            int PulsatorHitChance = rand.nextInt(1,11);
                // In case of using the Pusulator gun and succeding 
            if (PulsatorHitChance > 4) {
              System.out.println(); 
              System.out.println("Your pulsator energizes and your ship trembles under its power. The stupendous gun lets out a trememdous amount of pure energy, riping through the ship");
              banditHealth -= poweredGuns;
              if (banditHealth <= 0) {
                  fightDone = true;
                  territory += 5;
                  System.out.println();
                  System.out.println("You beat the ship and gained some territory!");
                  System.out.println("Territory + 5");
                
                  banditHealth = 4 + (territory/10);
                  banditMainGuns = 1 + (territory/10);
                  banditPoweredGun = 2 + (territory/5);

                } else {
                    banditAttack();
                }
      } else {
                  // In case of using the Pusulator gun and fail
                  System.out.println();
                  System.out.println("You get giddy and shoot before your locked on. The bright beam of light soars into the local moon, hope no one saw that one...");
                  banditAttack();
                }
        }
      }
  }


  
  public static void sneakAttack() {
  System.out.println();
  System.out.println("Your ship slowly edges up to the enemy...");
  int sneakChance = rand.nextInt(1, 4);

  // In case of Successful Sneak

  if (sneakChance > 1) {
    
    System.out.println();
    System.out.println("The ship is oblivous to the slow humming of your engines, and is caught off guard!");
    System.out.println();
    System.out.println(" 🔳🔷🔳🔳⭕⭕🔳🔶🔶🔶🔳⭕⭕🔳🔳🔷🔳 ");
    System.out.println();
    System.out.println("            Health: " + health);
    System.out.println();
    System.out.println("         Bandit Health: " + banditHealth);
    System.out.println();
    System.out.println("Captain, what weapon do you choose?");
    System.out.println();
    System.out.println("🔫 (M) " + mainGunsName + ": " + mainGuns + " dmg 80% chance to hit");
    System.out.println("✨ 🔫 ✨ (C) " + chargedGunName + ": " + poweredGuns + " dmg 60% chance to hit");
    System.out.println("💨 FLEE: 75% chance");
    System.out.println();
    System.out.println(" 🔳🔷🔳🔳⭕⭕🔳🔶🔶🔶🔳⭕⭕🔳🔳🔷🔳 ");
    System.out.println();

    String str = sc.nextLine();

    // In case of using the main guns

    if (str.toLowerCase().equals("main") || str.toLowerCase().equals("m")) {
      int mainHitChance = rand.nextInt(1, 11);

      // In case of using the main guns successively

      if (mainHitChance > 2) {
        System.out.println();
        System.out.println(
            "Your main guns bombard the ships hull causing a chain effect of explosions, he never SAW that coming!");
        banditHealth -= mainGuns * 2;
        if (banditHealth <= 0) {
          fightDone = true;
          territory += 5;
          System.out.println();
          System.out.println("You beat the ship and gained some territory!");
          System.out.println("Territory + 5");

          banditHealth = 4 + (territory / 10);
          banditMainGuns = 0.5 + (territory / 10);
          banditPoweredGun = 1 + (territory / 5);
        }
        Attack.PlayerAttack();
        if (banditHealth <= 0) {
          fightDone = true;
          territory += 5;
          // System.out.println();
          System.out.println("You beat the ship and gained some territory!");
          System.out.println("Territory + 5");

          banditHealth = 4 + (territory / 10);
          banditMainGuns = 1 + (territory / 10);
          banditPoweredGun = 2 + (territory / 5);
        }
      } else {

        // In case of using the main guns and failing

        System.out.println();
        System.out.println(
            "Your main guns aren't callibrated and fire at an astroid. It explodes in half and goes into the planets atmosphere");
        Attack.PlayerAttack();
      }
      // In case of using the Pulsator gun
    } else if (str.toLowerCase().equals("charged") || str.toLowerCase().equals("c")) {
      int PulsatorHitChance = rand.nextInt(1, 11);
      // In case of using the Pusulator gun and succeding
      if (PulsatorHitChance > 4) {
        System.out.println();
        System.out.println(
            "Your pulsator energizes and your ship trembles under its power. The stupendous gun lets out a trememdous amount of pure energy, riping through the ship. You caught them off guard!");
        banditHealth -= poweredGuns * 2;
        if (banditHealth <= 0) {
          fightDone = true;
          territory += 5;
          System.out.println();
          System.out.println("You beat the ship and gained some territory!");
          System.out.println("Territory + 5");

          banditHealth = 4 + (territory / 10);
          banditMainGuns = 0.5 + (territory / 10);
          banditPoweredGun = 1 + (territory / 5);
        }
        Attack.PlayerAttack();
        if (banditHealth <= 0) {
          fightDone = true;
          territory += 5;
          System.out.println();
          System.out.println("You beat the ship and gained some territory!");
          System.out.println("Territory + 5");

          banditHealth = 4 + (territory / 10);
          banditMainGuns = 0.5 + (territory / 10);
          banditPoweredGun = 1 + (territory / 5);
        }
      } else {
        // In case of using the Pusulator gun and fail
        System.out.println();
        System.out.println(
            "You get giddy and shoot before your locked on. The bright beam of light soars into the local moon, hope no one saw that one...");
        Attack.PlayerAttack();
      }
    }
  } else {
    // In case of failing sneak
    System.out.println();
    System.out.println("Good try Captain, theres always nextime...");
    System.out.println();
    System.out.println(
        "The enemy ship spots you moseying your way through the astroid belt and shoots ya with a big one");
    System.out.println("Health - " + banditMainGuns);
    health -= banditMainGuns;
    Attack.PlayerAttack();
  }    
}    
}