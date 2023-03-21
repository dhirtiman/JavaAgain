public class Demo {
    public static void main(String[] args) {

        // VampireKing Karrs = new VampireKing("Karrs");
        // Karrs.showInfo();

        // while (Karrs.getLives() > 0) {
        //     if (Karrs.dodges()) {
        //         continue;
        //     }
        //     if (Karrs.runAway()) {
        //         System.out.println(Karrs.getName() + " Ran Away");
        //         break;
        //     } else {
        //         Karrs.takeDamage(80);
        //         Karrs.showInfo();
        //     }

        // } System.out.println("=============================");

        Player dk = new Player("Dhirtiman");
        dk.pickUpLoot(new Loot("Invisibility Potion ",LootType.POTION,4));
        dk.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 183));
        dk.pickUpLoot(new Loot("Ring of speed", LootType.RING, 25));
        dk.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
        dk.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));
        dk.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        dk.pickUpLoot(new Loot("Chain Mail", LootType.ARMOR, 4));
        dk.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        dk.pickUpLoot(new Loot("Health Potion", LootType.POTION, 3));
        dk.pickUpLoot(new Loot("Silver Ring",LootType.RING, 6));
        dk.showInventory();
        
        System.out.println(dk.score());
        dk.dropLoot("Cursed Shield");

        System.out.println(dk.score());

    }

}
