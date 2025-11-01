package Storage;

import static Storage.Var.*;

public class Status {
  public static void displayStatus() {
    System.out.println("");
    System.out.println(" 🔳🔷🔳🔳🔳🔶🔶🔶🔳🔳🔳🔷🔳 ");
    // Ship Profile
    System.out.println("🔳                        🔳");
    System.out.println("🔳          " + name1 + "          🔳");
    System.out.println("🔳                        🔳");

    System.out.println("🔳         Tier 1         🔳");
    System.out.println("🔳     ❤️  (H) " + shipBodyName + ": " + health + " health     🔳");
    System.out.println("🔳     🔫  (MG) " + mainGunsName + ": " + mainGuns + " dmg     🔳");
    System.out.println("🔳     ✨ 🔫 ✨  (CG) " + chargedGunName + ": " + poweredGuns + " dmg     🔳");
    System.out.println("🔳    🌌 Cosmic Dust: " + cd + "   🔳");
    System.out.println("🔳    🌎 Territory: " + territory + "   🔳");
    System.out.println("🔳                        🔳");
    System.out.println(" 🔳🔷🔳🔳🔳🔶🔶🔶🔳🔳🔳🔷🔳 ");

    // Choices for player
    System.out.println("🔳                        🔳");
    System.out.println("🔳                        🔳");

    System.out.println("🔳         Actions        🔳");
    System.out.println("🔳                        🔳");
    System.out.println("🔳        ⚔️  Fight        🔳");
    System.out.println("🔳        ⛏️  Mine         🔳");
    System.out.println("🔳       ✨ Upgrade       🔳");
    System.out.println("🔳       🧭 Explore       🔳");
    System.out.println("🔳            " + novaClubString + "            🔳");

    System.out.println("🔳                        🔳");
    System.out.println(" 🔳🔷🔳🔳🔳🔶🔶🔶🔳🔳🔳🔷🔳 ");
    System.out.println();
  }
}